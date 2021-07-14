package com.sudreeshya.daily.proxydemo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAccountWrongWay implements Payment {

    private double balance = 0.0;
    private PaymentType paymentType;

    private int pin;
    private String signature;

    @Override
    public void loadBalance(double amount) {
        switch (paymentType){
            case ATM:
                if(pin == 123){
                    balance = balance + amount;
                }
            case CHEQUE:
                if(signature.equals("Anish")){
                    balance = balance + amount;
                }
        }
    }

    @Override
    public double checkBalance() {
        switch (paymentType){
            case ATM:
                if(pin == 123){
                   return balance;
                }else{
                    System.out.println("Invalid pin");
                }
            case CHEQUE:
                if(signature.equals("Anish")){
                    return balance;
                }else{
                    System.out.println("Invalid signature");
                }
            default:
                System.out.println("Invalid Option for Payment");
                return -1;
        }

    }

    @Override
    public void pay(double amount) {
        switch (paymentType){
            case ATM:
                if(pin == 123){
                    balance = balance - amount;
                }else{
                    System.out.println("Invalid pin");
                }
            case CHEQUE:
                if(signature.equals("Anish")){
                    balance = balance - amount;
                }else{
                    System.out.println("Invalid signature");
                }
            default:
                System.out.println("Invalid Option for Payment");
        }
    }
}
