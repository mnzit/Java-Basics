package com.sudreeshya.day5.depedencyinversion;

public class Sub implements Calculation {

    @Override
    public int calculate(int i, int j) {
        return i - j;
    }

    @Override public double calculate(double i, double j) {
        return i - j;
    }
}
