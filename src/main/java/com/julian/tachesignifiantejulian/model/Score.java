package com.julian.tachesignifiantejulian.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // L'ID indispensable pour que le JpaRepository fonctionne !

    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    private int quarter;

    // 1. Constructeur par défaut
    public Score() {
        this.homeTeam = "Home";
        this.awayTeam = "Away";
        this.homeScore = 0;
        this.awayScore = 0;
        this.quarter = 1;
    }

    // 2. Constructeur avec paramètres
    public Score(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;
        this.awayScore = 0;
        this.quarter = 1;
    }

    // --- GETTER ET SETTER POUR L'ID ---
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // --- Tes autres Getters and Setters ---
    public String getHomeTeam() { return homeTeam; }
    public void setHomeTeam(String homeTeam) { this.homeTeam = homeTeam; }
    public String getAwayTeam() { return awayTeam; }
    public void setAwayTeam(String awayTeam) { this.awayTeam = awayTeam; }
    public int getHomeScore() { return homeScore; }
    public void setHomeScore(int homeScore) { this.homeScore = homeScore; }
    public int getAwayScore() { return awayScore; }
    public void setAwayScore(int awayScore) { this.awayScore = awayScore; }
    public int getQuarter() { return quarter; }
    public void setQuarter(int quarter) { this.quarter = quarter; }
}
