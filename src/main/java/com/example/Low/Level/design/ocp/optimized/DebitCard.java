package com.example.Low.Level.design.ocp.optimized;

public class DebitCard implements Paymentmethod {
    @Override
    public void pay(){
        System.out.println("Debitcard");
    }
}
