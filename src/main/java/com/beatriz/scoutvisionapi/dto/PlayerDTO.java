package com.beatriz.scoutvisionapi.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PlayerDTO {

    @NotBlank(message = "Nome é obrigatório")
    private String name;

    @NotBlank(message = "Posição é obrigatória")
    private String position;

    @Min(value = 0, message = "Ataque mínimo é 0")
    @Max(value = 100, message = "Ataque máximo é de 100")
    private Integer attack;

    @Min(value = 0, message = "Defesa miníma é 0")
    @Max(value = 100, message = "Defesa máxima é 100")
    private Integer defense;

    @Min(value = 1, message = "Valor deve ser maior que zero")
    private Double marketValue;
}
