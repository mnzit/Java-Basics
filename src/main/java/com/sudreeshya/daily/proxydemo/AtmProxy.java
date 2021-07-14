package com.sudreeshya.daily.proxydemo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AtmProxy implements Payment {

    private Payment payment;
    private int pin;

    public void init(Payment payment,int pin) {
        this.payment = payment;
        this.pin = pin;
    }

    @Override
    public void loadBalance(double amount) {
        if (pin == 123) {
            payment.loadBalance(amount);
        } else {
            System.out.println("Incorrect Pin");
        }
    }

    @Override
    public double checkBalance() {
        if (pin == 123) {
            return payment.checkBalance();
        } else {
            System.out.println("Incorrect Pin");
        }
        return 0;
    }

    @Override
    public void pay(double amount) {
        if (pin == 123) {
            payment.pay(amount);
        } else {
            System.out.println("Incorrect Pin");
        }
    }


}
