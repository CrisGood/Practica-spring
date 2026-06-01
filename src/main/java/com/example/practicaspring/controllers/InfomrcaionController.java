package com.example.practicaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfomrcaionController {

    @GetMapping("/informacion")
    public String informacion(Model model) {
        model.addAttribute("titulo", "Información");
        model.addAttribute("descripcion", "Página de información de ejemplo.");
        return "informacion";
    }
}
