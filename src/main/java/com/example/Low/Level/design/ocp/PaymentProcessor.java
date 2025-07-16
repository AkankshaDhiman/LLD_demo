package com.example.Low.Level.design.ocp;

public class PaymentProcessor {

    public void creditCard(){
        System.out.println("Transaction processed by creditCard");
    }
    public void debitCard(){
        System.out.println("Transaction processed by debitCard");
    }
    public void payPal(){
        System.out.println("Transaction processed by payPal");
    }
}
