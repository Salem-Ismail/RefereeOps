package com.refereeops;

public class Report {
    private int reportId;
    private int matchId;
    private int refereeId;
    private int homeScore;
    private int awayScore;
    private String notes;

    public Report(int reportId, int matchId, int refereeId, int homeScore, int awayScore, String notes) {
        this.reportId = reportId;
        this.matchId = matchId;
        this.refereeId = refereeId;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.notes = notes;
    }

    public int getReportId() {
        return reportId;
    }
    public int getMatchId() {
        return matchId;
    }
    public int getRefereeId() {
        return refereeId;
    }
    public int getHomeScore() {
        return homeScore;
    }
    public int getAwayScore() {
        return awayScore;
    }
    public String getNotes() {
        return notes;
    }

}

