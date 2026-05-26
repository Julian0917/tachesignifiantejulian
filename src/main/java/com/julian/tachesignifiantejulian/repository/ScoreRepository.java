package com.julian.tachesignifiantejulian.repository;

import com.julian.tachesignifiantejulian.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {
    // Toutes les méthodes CRUD automatiques sont maintenant disponibles
}
