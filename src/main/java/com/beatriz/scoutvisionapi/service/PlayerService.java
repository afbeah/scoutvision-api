package com.beatriz.scoutvisionapi.service;

import com.beatriz.scoutvisionapi.dto.FantasyTeamDTO;
import com.beatriz.scoutvisionapi.dto.PlayerDTO;
import com.beatriz.scoutvisionapi.dto.TeamAverageDTO;
import com.beatriz.scoutvisionapi.entity.Player;
import com.beatriz.scoutvisionapi.repository.PlayerRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayersByPosition(String position) {
        return playerRepository.findByPosition(position);
    }

    public List<Player> getTopAttackPlayers() {

        return playerRepository.findAll(
                Sort.by(Sort.Direction.DESC, "attack")
        );
    }

    public List<Player> getTopDefensePlayers() {

        return playerRepository.findAll(
                Sort.by(Sort.Direction.DESC, "defense")
        );
    }

    public TeamAverageDTO getTeamAverage() {

        List<Player> players = playerRepository.findAll();

        double averageAttack = players.stream()
                .mapToInt(Player::getDefense)
                .average()
                .orElse(0.0);

        double averageDefense = players.stream()
                .mapToInt(Player::getDefense)
                .average()
                .orElse(0.0);

        double averageMarketValue = players.stream()
                .mapToDouble(Player::getMarketValue)
                .average()
                .orElse(0.0);

        return new TeamAverageDTO(
                averageAttack,
                averageDefense,
                averageMarketValue
        );
    }

    public FantasyTeamDTO getFantasyTeam() {

        List<Player> players = playerRepository.findAll();

        Player attacker = players.stream()
                .max(Comparator.comparing(Player::getAttack))
                .orElse(null);

        Player defender = players.stream()
                .max(Comparator.comparing(Player::getDefense))
                .orElse(null);

        Player midfielder = players.stream()
                .max(
                        Comparator.comparing(
                                player -> player.getAttack() + player.getDefense()
                        )
                )
                .orElse(null);

        return new FantasyTeamDTO(
                attacker,
                midfielder,
                defender
        );

    }

    public Player getBestValuePlayer() {

        List<Player> players = playerRepository.findAll();

        return players.stream()
                .max(
                        Comparator.comparing(
                                player ->
                                        (player.getAttack() + player.getDefense())
                                                / player.getMarketValue()
                        )
                )
                .orElse(null);
    }

    public Player savePlayer(PlayerDTO playerDTO) {

        Player player = new Player();

        player.setName(playerDTO.getName());
        player.setPosition(playerDTO.getPosition());
        player.setAttack(playerDTO.getAttack());
        player.setDefense(playerDTO.getDefense());
        player.setMarketValue(playerDTO.getMarketValue());

        return playerRepository.save(player);
    }
}
