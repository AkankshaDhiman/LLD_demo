package com.example.Low.Level.design.ocp.optimized;

public class CreditCard implements Paymentmethod{
    @Override
    public void pay() {
        System.out.println("Debitcard");
    }
}
