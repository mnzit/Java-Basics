package com.sudreeshya.daily.factory;

public class SubCommand extends MathCommand{

    @Override
    public Double calculate(Double x, Double y) {
        return x-y;
    }
}
