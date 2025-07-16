package com.example.Low.Level.design.ocp.optimized;

public class PaymentProcess {

    public void processPayment(Paymentmethod paymentmethod) {
        paymentmethod.pay();
    }
}
