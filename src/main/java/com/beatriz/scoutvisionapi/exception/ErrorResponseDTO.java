package com.beatriz.scoutvisionapi.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ErrorResponseDTO {

    private Integer status;

    private String message;

    private LocalDateTime timestamp;

}
