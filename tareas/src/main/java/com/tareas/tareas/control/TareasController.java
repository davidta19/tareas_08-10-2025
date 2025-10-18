package com.tareas.tareas.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tareas.tareas.modelo.Tarea;
import com.tareas.tareas.repository.TareasRepository;

@RestController
@RequestMapping("/Tareas")
public class TareasController {
    @Autowired
    TareasRepository repositorio;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Tarea crearTarea(@RequestBody Tarea todo) {
        return repositorio.save(todo);
    }

    @GetMapping("/")
    public Iterable<Tarea> getTareas() {
        return repositorio.findAll();

    }
}
