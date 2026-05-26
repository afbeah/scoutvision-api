package com.beatriz.scoutvisionapi.controller;

import com.beatriz.scoutvisionapi.dto.FantasyTeamDTO;
import com.beatriz.scoutvisionapi.dto.PlayerDTO;
import com.beatriz.scoutvisionapi.dto.TeamAverageDTO;
import com.beatriz.scoutvisionapi.entity.Player;
import com.beatriz.scoutvisionapi.service.PlayerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers(
            @RequestParam(required = false) String position
    ) {

        if (position != null) {
            return playerService.getPlayersByPosition(position);
        }

        return playerService.getAllPlayers();
    }

    @GetMapping("/top-attack")
    public List<Player> getTopAttackPlayers() {
        return playerService.getTopAttackPlayers();
    }

    @GetMapping("/top-defense")
    public List<Player> getTopDefensePlayers() {
        return playerService.getTopDefensePlayers();
    }

    @GetMapping("/team-average")
    public TeamAverageDTO getTeamAverage() {
        return playerService.getTeamAverage();
    }

    @GetMapping("/fantasy-team")
    public FantasyTeamDTO getFantasyTeam() {
        return playerService.getFantasyTeam();
    }

    @GetMapping("/best-value")
    public Player getBestValuePlayer() {
        return playerService.getBestValuePlayer();
    }

    @GetMapping("/national-team/{nationalTeam}")
    public List<Player> getPlayerByNationalTeam(
            @PathVariable String nationalTeam
    ) {
        return playerService
                .getPlayerByNationalTeam(
                        nationalTeam
                );
    }

    @GetMapping("/world-cup")
    public List<Player> getWorldCupPlayers() {
        return playerService
                .getWorldCupPlayers();
    }

    @PostMapping
    public Player createPlayer(@Valid @RequestBody PlayerDTO playerDTO) {
        return playerService.savePlayer(playerDTO);
    }
}
