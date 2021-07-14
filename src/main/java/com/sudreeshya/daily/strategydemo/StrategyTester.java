package com.sudreeshya.daily.strategydemo;

import com.sudreeshya.daily.strategydemo.strategy.DashainSpecialStrategy;
import com.sudreeshya.daily.strategydemo.strategy.NormalStrategy;

public class StrategyTester {
    public static void main(String[] args) {
        CustomerBill customerBill = new CustomerBill(new NormalStrategy());

        customerBill.add(560.0, 5);
        customerBill.add(4500, 1);

        customerBill.print();
    }
}
