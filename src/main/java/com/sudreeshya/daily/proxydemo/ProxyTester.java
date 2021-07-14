package com.sudreeshya.daily.proxydemo;

public class ProxyTester {

    public static void main(String[] args) {

//        BankAccountWrongWay bankAccountWrongWay = new BankAccountWrongWay();
//        bankAccountWrongWay.setBalance(500.0);
//        bankAccountWrongWay.setPaymentType(PaymentType.ATM);
//        bankAccountWrongWay.setPin(1238);
//
//        System.out.println(bankAccountWrongWay.checkBalance());
//
//        BankAccount bankAccount = new BankAccount();
//        bankAccount.setBalance(1000);
//        bankAccount.setAtmPin(123);
//        bankAccount.setSignature("Anish");
//
//        CheckoutFacade.checkout(PaymentType.ATM, bankAccount, 200);
//        System.out.println( bankAccount.getBalance());


        Database database = new MeroshareProxyCache();

        String[] participants = database.getDepositoryParticipant();

        for (String participant : participants) {
            System.out.println(participant);
        }
        System.out.println("--------------------------------");
        String[] participants1 = database.getDepositoryParticipant();

        for (String participant : participants1) {
            System.out.println(participant);
        }
    }
}
