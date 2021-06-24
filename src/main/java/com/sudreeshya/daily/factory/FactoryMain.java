package com.sudreeshya.daily.factory;

import com.sudreeshya.daily.factory.request.PaymentRequest;

public class FactoryMain {

    public static void main(String[] args) {
        String operator = args[0];
        Double operand1 = Double.parseDouble(args[1]);
        Double operand2 = Double.parseDouble(args[2]);

        MathCommand mathCommand = MathCommandFactory.get(operator);
        System.out.println(mathCommand.calculate(operand1,operand2));


        Payment payment = PaymentFactory.get(PaymentType.ESEWA);
        payment.initializeRequest(new PaymentRequest("Kitkat", 60D));
        System.out.println(payment.pay());
    }
}
