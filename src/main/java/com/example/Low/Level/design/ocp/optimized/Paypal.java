package com.example.Low.Level.design.ocp.optimized;

public class Paypal implements Paymentmethod {
    @Override
    public void pay() {
        System.out.println("Debitcard");
    }
}
