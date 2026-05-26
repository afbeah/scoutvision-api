package com.beatriz.scoutvisionapi.controller;

import com.beatriz.scoutvisionapi.dto.PlayerDTO;
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

    @PostMapping
    public Player createPlayer(@Valid @RequestBody PlayerDTO playerDTO) {
        return playerService.savePlayer(playerDTO);
    }
}
