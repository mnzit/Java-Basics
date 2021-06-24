package com.sudreeshya.daily.factory;

public class AddCommand extends MathCommand{

    @Override
    public Double calculate(Double x, Double y) {
        return x+y;
    }
}
