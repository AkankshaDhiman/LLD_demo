package com.example.Low.Level.design.ocp.optimized;
import com.example.Low.Level.design.ocp.PaymentProcessor;
public class Main {
    public static void main(String[] args) {
        PaymentProcess pp = new PaymentProcess();
        pp.processPayment(new CreditCard());
        pp.processPayment(new DebitCard());

    }
}
