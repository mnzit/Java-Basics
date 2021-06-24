package com.sudreeshya.daily.factory.request;

public class PaymentRequest {

    private String product;
    private Double amount;

    public PaymentRequest(String product, Double amount) {
        this.product = product;
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
