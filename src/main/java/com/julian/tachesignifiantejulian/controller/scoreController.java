package com.julian.tachesignifiantejulian.controller;

import com.julian.tachesignifiantejulian.model.Score;
import com.julian.tachesignifiantejulian.repository.ScoreRepository;
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

    @Autowired
    private ScoreRepository scoreRepository;

    // Afficher la page d'accueil avec la liste des scores directe du Repository
    @GetMapping("/")
    public String index(Model model) {
        List<Score> scores = scoreRepository.findAll(); // On lit directement dans la base de données !
        model.addAttribute("scores", scores);
        return "index";
    }

    // Ajouter un nouveau match (Formulaire)
    @PostMapping("/scores/add")
    public String addScore(@RequestParam("points") int points) {
        Score score = new Score();
        score.setHomeTeam("Home Team");
        score.setAwayTeam("Away Team");
        score.setHomeScore(points);
        score.setAwayScore(0);
        score.setQuarter(1);

        scoreRepository.save(score); // On sauvegarde directement dans la base de données !
        return "redirect:/";
    }

    // Supprimer un match
    @GetMapping("/scores/delete/{id}")
    public String deleteScore(@PathVariable Long id) {
        scoreRepository.deleteById(id);
        return "redirect:/";
    }
}