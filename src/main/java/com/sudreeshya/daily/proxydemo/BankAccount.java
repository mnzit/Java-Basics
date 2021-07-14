package com.sudreeshya.daily.proxydemo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAccount implements Payment {

    private double balance = 0.0;
    private int atmPin;
    private String signature;

    @Override
    public void loadBalance(double amount) {
        balance = balance + amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void pay(double amount) {
        balance = balance - amount;
    }
}
