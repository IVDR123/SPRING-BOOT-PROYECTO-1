package com.tareas.tareas.dto;

import lombok.Data;

@Data
public class TareaResponseDTO {
    private Long id;
    private String title;
    private String description;
    private Boolean completed;
}
