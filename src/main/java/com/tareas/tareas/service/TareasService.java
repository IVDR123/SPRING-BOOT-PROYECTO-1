package com.tareas.tareas.service;

import com.tareas.tareas.dto.TareaRequestDTO;
import com.tareas.tareas.dto.TareaResponseDTO;
import com.tareas.tareas.exception.ResourceNotFoundException;
import com.tareas.tareas.model.Tareas;
import com.tareas.tareas.repository.TareasRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TareasService {
    private final TareasRepository repository;
    private final ModelMapper modelMapper;

    public TareasService(TareasRepository tareasRepository, ModelMapper modelMapper) {
        this.repository = tareasRepository;
        this.modelMapper = modelMapper;
    }
    //Mostrar todas las tareas
    public List<TareaResponseDTO> findAll(){
        return repository.findAll().stream()
                .map(t->modelMapper.map(t,TareaResponseDTO.class))
                .collect(Collectors.toList());
    }
    //Filtrar las tareas por id
    public TareaResponseDTO findById(Long id){
        Tareas tarea = repository.findById(id)
                .orElseThrow(()->new RuntimeException("Tarea no encontrada"));
        return  modelMapper.map(tarea, TareaResponseDTO.class);
    }

    //Crear tarea
    public TareaResponseDTO crear(TareaRequestDTO tareas){
        Tareas tarea = modelMapper.map(tareas, Tareas.class);
        Tareas guardar = repository.save(tarea);
        return modelMapper.map(guardar, TareaResponseDTO.class);
    }

    //Actualizar tarea
    public TareaResponseDTO actualizar(Long id, TareaRequestDTO tareas){
        Tareas tarea = repository.findById(id).orElseThrow(()->new RuntimeException("Tarea no encontrada"));
        modelMapper.map(tareas, tarea);

        Tareas updated = repository.save(tarea);

        return modelMapper.map(updated, TareaResponseDTO.class);
    }

    //Eliminar tarea
    public void eliminar(Long id){
        repository.deleteById(id);
    }
}
