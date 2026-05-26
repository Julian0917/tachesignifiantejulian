package com.julian.tachesignifiantejulian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // On garde @Controller ici pour qu'il cherche un fichier HTML
public class scoreController {

    @GetMapping("/")
    public String index() {
        return "index"; // Doit correspondre à index.html dans le dossier templates
    }
}