package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A singleton service for the game engine
 */
public class GameService {
    private static GameService instance;
    private List<Game> games;
    private long nextGameId;

    // Private constructor to prevent direct instantiation
    private GameService() {
        games = new ArrayList<>();
        nextGameId = 1;
    }

    // Singleton instance getter
    public static GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

    // Add a new game to the list or return existing game if name matches
    public Game addGame(String name) {
        Iterator<Game> iterator = games.iterator();
        while (iterator.hasNext()) {
            Game existingGame = iterator.next();
            if (existingGame.getName().equals(name)) {
                return existingGame;
            }
        }
        Game newGame = new Game(nextGameId++, name);
        games.add(newGame);
        return newGame;
    }

    // Get a game by its ID
    public Game getGame(long id) {
        for (Game game : games) {
            if (game.getId() == id) {
                return game;
            }
        }
        return null;
    }

    // Get a game by its name
    public Game getGame(String name) {
        for (Game game : games) {
            if (game.getName().equals(name)) {
                return game;
            }
        }
        return null;
    }

    // Get the count of active games
    public int getGameCount() {
        return games.size();
    }
}
