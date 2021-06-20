package com.sudreeshya.day5.playable;

// concrete - complete
public class Football extends Ball {

    @Override
    public void play() {
        color = "White";
        System.out.println("Playing " + color + " football");
    }
}
