package com.tareas.tareas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tareas.tareas.modelo.Tarea;

@Repository

public interface TareasRepository extends JpaRepository<Tarea, Long> {

}
