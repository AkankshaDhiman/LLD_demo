package com.example.Low.Level.design.ocp.optimized;

public class upi implements Paymentmethod {
    @Override
    public void pay() {
        System.out.println("upi payment");
    }
}
