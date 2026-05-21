package com.julian.tachesignifiantejulian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class scoreController {

    @GetMapping("/")
    public String index() {
        return "Scoring Portal";
    }
}

