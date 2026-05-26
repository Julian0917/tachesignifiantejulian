package com.julian.tachesignifiantejulian.model;

public class Score {

    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    private int quarter;

    // 1. Constructeur par défaut (Déjà très bien !)
    public Score() {
        this.homeTeam = "Home";
        this.awayTeam = "Away";
        this.homeScore = 0;
        this.awayScore = 0;
        this.quarter = 1;
    }

    // 2. Constructeur avec paramètres (À AJOUTER pour compléter l'étape 4)
    public Score(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0; // Le match commence toujours à 0
        this.awayScore = 0;
        this.quarter = 1;   // Au 1er quart-temps
    }

    // --- Garde TOUS tes Getters and Setters en dessous ---
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
