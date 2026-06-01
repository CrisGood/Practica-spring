package com.example.practicaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class UsuarioController {

    @GetMapping("/gestionusuarios")
    public String gestionUsuarios(Model model) {
        List<Map<String,String>> usuarios = List.of(
                Map.of("id","1","name","Alice"),
                Map.of("id","2","name","Bob")
        );
        model.addAttribute("usuarios", usuarios);
        return "gestionusuarios";
    }
}
