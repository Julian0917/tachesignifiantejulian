package com.julian.tachesignifiantejulian.model;

public class Score {

    private String homeTeam;
    private String awayTeam;

    private int homeScore;
    private int awayScore;

    private int quarter;

    // Constructor
    public Score() {
        this.homeTeam = "Home";
        this.awayTeam = "Away";
        this.homeScore = 0;
        this.awayScore = 0;
        this.quarter = 1;
    }

    // Getters and Setters

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }
}