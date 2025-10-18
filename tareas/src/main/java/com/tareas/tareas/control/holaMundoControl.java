package com.tareas.tareas.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holaMundoControl {


    @GetMapping ("/")
    public String hola(){
        return "Hola mundo";
    }

}
