package com.sudreeshya.day5;

import com.sudreeshya.day5.playable.Basketball;
import com.sudreeshya.day5.playable.BasketballV2;
import com.sudreeshya.day5.playable.Playable;

public class Main {

    public static void main(String args[]) {
//        justPlay(new Guitar());

        // overloading -> static polymorphism // compile
        // overriding -> dynamic polymorphism // runtime
        Basketball ball = new BasketballV2();
        ball.play();
    }

    public static void justPlay(Playable playable) {
        playable.play();
    }
}
