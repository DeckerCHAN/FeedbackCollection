package com.deckerchan.fc.core;

/**
 * Created by deckerchan on 22/12/16.
 */
public class Engine {
    public static Engine instance;

    private Engine() {

    }

    public Engine getEngine() {
        if (instance == null) {
            instance = new Engine();
        }
        return instance;
    }
}
