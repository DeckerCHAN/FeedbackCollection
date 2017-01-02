package com.deckerchan.fc.utils;

import com.google.gson.Gson;

/**
 * Created by deckerchan on 21/12/16.
 */
public class Serilization {
    private static Gson gsonOjb;

    static {
        gsonOjb = new Gson();
    }

    private Serilization() {

    }

    public static String toJson(Object obj) {
        return gsonOjb.toJson(obj);
    }
}
