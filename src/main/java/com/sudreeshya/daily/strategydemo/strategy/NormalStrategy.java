package com.sudreeshya.daily.strategydemo.strategy;

public class NormalStrategy implements BillingStrategy {
    @Override
    public double getActPrice(double rawPrice) {
        return rawPrice;
    }
}
