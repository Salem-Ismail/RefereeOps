package com.refereeops;

public class Main {
    public static void main(String[] args) {
        // Create a new referee
        Referee alice = new Referee("Alice Johnson", 8);
        
        // Print the referee's information
        System.out.println("Referee: " + alice.getName());
        System.out.println("Level: " + alice.getLevel());
        
        // Test the Match class
        Match game1 = new Match(1, "2025-10-03T15:00:00Z", "Tigers U12", "Lions U12", 8);
        
        System.out.println("\nMatch Details");
        System.out.println("Match ID: " + game1.getMatchId());
        System.out.println("Date: " + game1.getDate());
        System.out.println("Teams: " + game1.getHomeTeam() + " vs " + game1.getAwayTeam());
        System.out.println("Required Level: " + game1.getRequiredLevel());
        
        // Test the Assignment class
        Assignment assignment1 = new Assignment(1, 1, 1, "REF");
        
        System.out.println("\nAssignment Details");
        System.out.println("Assignment ID: " + assignment1.getAssignmentId());
        System.out.println("Match ID: " + assignment1.getMatchId());
        System.out.println("Referee ID: " + assignment1.getRefereeId());
        System.out.println("Role: " + assignment1.getRole());

        // Test the Report class
        Report report1 = new Report(1, 1, 1, 2, 1, "Great game! Tigers won 2-1. No major incidents.");
        
        System.out.println("\nMatch Report:");
        System.out.println("Report ID: " + report1.getReportId());
        System.out.println("Match ID: " + report1.getMatchId());
        System.out.println("Referee ID: " + report1.getRefereeId());
        System.out.println("Final Score: " + report1.getHomeScore() + " - " + report1.getAwayScore());
        System.out.println("Notes: " + report1.getNotes());
    }
}