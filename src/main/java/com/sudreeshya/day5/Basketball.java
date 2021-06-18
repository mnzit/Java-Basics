package com.sudreeshya.day5;

// concrete - complete
public class Basketball extends Ball {

    @Override public void play() {
        color = "Red";
        System.out.println("Playing " + color + " basketball");
    }
}
