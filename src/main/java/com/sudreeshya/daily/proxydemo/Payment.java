package com.sudreeshya.daily.proxydemo;

public interface Payment {

    void loadBalance(double amount);

    double checkBalance();

    void pay(double amount);
}
