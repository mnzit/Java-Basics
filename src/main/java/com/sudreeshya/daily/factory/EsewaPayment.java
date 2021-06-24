package com.sudreeshya.daily.factory;

import com.sudreeshya.daily.factory.request.PaymentRequest;

public class EsewaPayment extends Payment {

    @Override public Object pay() {
        // Esewa hits
        return "Esewa wallet payment for amount : "
                + paymentRequest.getAmount() + " for the product : " + paymentRequest.getProduct();
    }
}
