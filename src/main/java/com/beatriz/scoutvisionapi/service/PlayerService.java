package com.beatriz.scoutvisionapi.service;

import com.beatriz.scoutvisionapi.dto.PlayerDTO;
import com.beatriz.scoutvisionapi.entity.Player;
import com.beatriz.scoutvisionapi.repository.PlayerRepository;
import org.springframework.stereotype.Service;

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
