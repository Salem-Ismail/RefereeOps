package com.refereeops;

public class Assignment {
    private int assignmentId;
    private int matchId;
    private int refereeId;
    private String role; // e.g., "Main Referee", "Assistant Referee"

    public Assignment(int assignmentId, int matchId, int refereeId, String role) {
        this.assignmentId = assignmentId;
        this.matchId = matchId;
        this.refereeId = refereeId;
        this.role = role;
    }

    public int getAssignmentId() {
        return assignmentId;
    }
    public int getMatchId() {
        return matchId;
    }
    public int getRefereeId() {
        return refereeId;
    }
    public String getRole() {
        return role;
    }

}
