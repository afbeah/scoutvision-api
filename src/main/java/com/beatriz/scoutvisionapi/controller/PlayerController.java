package com.beatriz.scoutvisionapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @GetMapping("/players")
    public List<String> getPlayers() {

        return List.of(
                "Rayan Victor",
                "Endrick",
                "Danilo Santos",
                "Bruno Guimarães"
        );
    }
}
