package com.tareas.tareas.dto;

import lombok.Data;

@Data
public class TareaRequestDTO {
    private String title;
    private String description;
    private Boolean completed;
}
