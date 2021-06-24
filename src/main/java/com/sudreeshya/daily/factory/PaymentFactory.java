package com.sudreeshya.daily.factory;

public class PaymentFactory {

    public static Payment get(PaymentType paymentType){
        switch (paymentType){
            case ESEWA:
                return new EsewaPayment();
        }
        return null;
    }
}
