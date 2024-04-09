package com.gamingroom;

/**
 * A simple class to hold information about a game
 */
public class Game {
    private long id;
    private String name;

    // Constructor
    public Game(long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for ID
    public long getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Override toString method for printing
    @Override
    public String toString() {
        return "Game [id=" + id + ", name=" + name + "]";
    }
}
