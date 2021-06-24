package com.sudreeshya.daily.factory;

public class NullCommand extends MathCommand{

    @Override
    public Double calculate(Double x, Double y) {
        return -1D;
    }
}
