package com.sudreeshya.daily.strategydemo.strategy.v2;

public class MulStrategy implements MathStrategy{
    @Override
    public double calculate(double x, double y) {
        return x*y;
    }
}
