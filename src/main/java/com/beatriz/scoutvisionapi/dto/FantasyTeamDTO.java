package com.beatriz.scoutvisionapi.dto;

import com.beatriz.scoutvisionapi.entity.Player;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class FantasyTeamDTO {

    private Player attacker;

    private Player midfielder;

    private Player defender;
}
