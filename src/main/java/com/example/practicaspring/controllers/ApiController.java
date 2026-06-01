package com.example.practicaspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
public class ApiController {

    @GetMapping("/api/greeting")
    public Map<String,String> greeting() {
        return Map.of("message","¡Hola desde RestController!");
    }

    @GetMapping("/api/time")
    public Map<String,String> time() {
        return Map.of("time", Instant.now().toString());
    }

}
