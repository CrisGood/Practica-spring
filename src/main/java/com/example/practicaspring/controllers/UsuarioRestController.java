package com.example.practicaspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UsuarioRestController {

    @GetMapping("/api/usuarios")
    public List<Map<String,String>> usuarios() {
        return List.of(
                Map.of("id","1","name","Alice"),
                Map.of("id","2","name","Bob")
        );
    }
}
