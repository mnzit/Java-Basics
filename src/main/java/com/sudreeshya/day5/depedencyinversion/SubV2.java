package com.sudreeshya.day5.depedencyinversion;

public class SubV2 extends Sub {

    @Override
    public int calculate(int i, int j) {
        return i - j + 1000;
    }

    @Override public double calculate(double i, double j) {
        return i - j + 1000;
    }
}
