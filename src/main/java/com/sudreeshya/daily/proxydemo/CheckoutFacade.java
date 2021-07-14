package com.sudreeshya.daily.proxydemo;

public class CheckoutFacade {

    public static void checkout(PaymentType paymentType, BankAccount bankAccount, double amount) {
        switch (paymentType) {
            case ATM:
                checkoutWithAtm(bankAccount, amount);
                break;
            case CHEQUE:
                checkoutWithCheque(bankAccount, amount);
                break;
        }
    }

    public static void checkoutWithAtm(BankAccount bankAccount, double amount) {
        AtmProxy atmProxy = new AtmProxy();
        atmProxy.init(bankAccount, 123);
        atmProxy.pay(amount);
    }

    public static void checkoutWithCheque(BankAccount bankAccount, double amount) {
        ChequeProxy chequeProxy = new ChequeProxy();
        chequeProxy.init(bankAccount, "Anish");
        chequeProxy.pay(amount);
    }
}
