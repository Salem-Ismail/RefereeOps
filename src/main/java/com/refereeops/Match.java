package com.refereeops;

public class Match {
    private int matchId;
    private int requiredLevel;
    private String date;
    private String homeTeam;
    private String awayTeam;

    public Match(int matchId, String date, String homeTeam, String awayTeam, int requiredLevel) {
        this.matchId = matchId;
        this.date = date;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.requiredLevel = requiredLevel;
    }

    public int getMatchId() {
        return matchId;
    }
    
    public String getDate() {
        return date;
    }
    
    public String getHomeTeam() {
        return homeTeam;
    }
    
    public String getAwayTeam() {
        return awayTeam;
    }
    
    public int getRequiredLevel() {
        return requiredLevel;
    }
}
