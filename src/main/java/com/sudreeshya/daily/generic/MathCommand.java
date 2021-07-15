package com.sudreeshya.daily.generic;

public interface MathCommand<O extends Number, R extends Number> {

    R calculate(O x, O y);
}
