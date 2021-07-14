package com.sudreeshya.daily.strategydemo.strategy.v2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MathContext {

    private MathStrategy mathStrategy;

    public double calculate(double d, double x) {
        return mathStrategy.calculate(d, x);
    }
}
