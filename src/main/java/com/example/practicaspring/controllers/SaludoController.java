package com.example.practicaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SaludoController {

    @GetMapping("/saludo")
    public String saludo(Model model) {
        model.addAttribute("nombre", "Usuario");
        return "saludo";
    }
}
