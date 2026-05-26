package com.julian.tachesignifiantejulian.service;

import com.julian.tachesignifiantejulian.model.Score;
import com.julian.tachesignifiantejulian.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;

    // Créer ou Mettre à jour un match
    public Score saveOrUpdateScore(Score score) {
        return scoreRepository.save(score);
    }

    // Récupérer tous les matchs de basket
    public List<Score> getAllScores() {
        return scoreRepository.findAll();
    }

    // Récupérer un match par son ID
    public Optional<Score> getScoreById(Long id) {
        return scoreRepository.findById(id);
    }

    // Supprimer un match de la liste
    public void deleteScoreById(Long id) {
        scoreRepository.deleteById(id);
    }
}