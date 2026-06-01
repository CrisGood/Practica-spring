package com.example.practicaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class WebController {

    @GetMapping("/web")
    public RedirectView web() {
        return new RedirectView("/hello.html");
    }

}
