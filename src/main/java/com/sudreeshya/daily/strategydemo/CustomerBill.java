package com.sudreeshya.daily.strategydemo;

import com.sudreeshya.daily.strategydemo.strategy.BillingStrategy;

import java.util.ArrayList;
import java.util.List;

public class CustomerBill {
    private final List<Double> drinks = new ArrayList<>();
    private BillingStrategy billingStrategy;


    public CustomerBill(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }

    public void add(double price, int quantity) {
        final double finalAmount = this.billingStrategy.getActPrice(((double) quantity) * price);
        drinks.add(finalAmount);
    }

    public void print() {
        Double grandTotal = 0.0;
        for (Double drink : drinks) {
            grandTotal = grandTotal + drink;
        }
        System.out.println("Total Due : " + grandTotal);
    }
}
