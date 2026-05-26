package com.julian.tachesignifiantejulian.controller;

import com.julian.tachesignifiantejulian.model.Score;
import com.julian.tachesignifiantejulian.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class scoreController {

    @Autowired
    private ScoreService scoreService;

    // Afficher la page d'accueil avec la liste des scores
    @GetMapping("/")
    public String index(Model model) {
        List<Score> scores = scoreService.getAllScores();
        model.addAttribute("scores", scores);
        return "index";
    }

    // Ajouter un nouveau match (Formulaire)
    @PostMapping("/scores/add")
    public String addScore(@ModelAttribute Score score) {
        scoreService.saveOrUpdateScore(score);
        return "redirect:/"; // Recharge la page d'accueil avec le nouveau match
    }

    // Supprimer un match
    @GetMapping("/scores/delete/{id}")
    public String deleteScore(@PathVariable Long id) {
        scoreService.deleteScoreById(id);
        return "redirect:/";
    }
}