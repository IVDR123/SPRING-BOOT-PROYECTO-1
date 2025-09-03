package com.tareas.tareas.repository;

import com.tareas.tareas.model.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareasRepository extends JpaRepository<Tareas,Long> {
}
