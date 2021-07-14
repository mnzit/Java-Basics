package com.sudreeshya.daily.strategydemo.strategy;

public class DashainSpecialStrategy implements BillingStrategy {
    @Override
    public double getActPrice(double rawPrice) {
        return rawPrice / 2;
    }
}
