package com.refereeops;

public class Referee {
    // Fields (data this referee has)
    private String name;
    private int level;
    
    // Constructor (creates a new referee)
    public Referee(String name, int level) {
        this.name = name;
        this.level = level;
    }
    
    // Method to get the referee's name
    public String getName() {
        return name;
    }
    
    // Method to get the referee's level
    public int getLevel() {
        return level;
    }
}