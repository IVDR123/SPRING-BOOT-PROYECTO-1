package com.tareas.tareas.controller;

import com.tareas.tareas.dto.TareaRequestDTO;
import com.tareas.tareas.dto.TareaResponseDTO;
import com.tareas.tareas.model.Tareas;
import com.tareas.tareas.service.TareasService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareasController {

    private final TareasService tareasService;

    public TareasController(TareasService tareasService) {
        this.tareasService = tareasService;
    }

    @GetMapping
    public List<TareaResponseDTO> getAll(){
        return tareasService.findAll();
    }

    @GetMapping("/{id}")
    public TareaResponseDTO getById(@PathVariable Long id){
        return tareasService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TareaResponseDTO create(@Valid @RequestBody TareaRequestDTO tareas){
        return tareasService.crear(tareas);
    }

    @PutMapping("/{id}")
    public TareaResponseDTO update(@PathVariable Long id, @RequestBody TareaRequestDTO tarea){
        return tareasService.actualizar(id, tarea);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        tareasService.eliminar(id);
    }
}
