package com.gamingroom;

/**
 * A class to test a singleton's behavior
 */
public class SingletonTester {

    public void testSingleton() {
        System.out.println("\nAbout to test the singleton...");
        
        // Obtain local reference to the singleton instance
        GameService service = GameService.getInstance();
        
        // A simple loop to print the games
        for (int i = 0; i < service.getGameCount(); i++) {
            System.out.println(service.getGame(i));
        }
    }
}
