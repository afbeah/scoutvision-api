package com.beatriz.scoutvisionapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TeamAverageDTO {

    private Double averageAttack;

    private Double averageDefense;

    private Double averageMarketValue;

}
