package com.sudreeshya.daily.generic;

public class MathCommandStore {
    public static MathCommand<Double, Double> subDoubleCommand = (x, y) -> x - y;
    public static MathCommand<Double, Double> addDoubleCommand = (x, y) -> x + y;
}
