package com.example.Low.Level.design.isp.optimized;

public class MultiPurposeMachine implements Printable, Scannable, Copyable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    @Override
    public void copy() {
        System.out.println("Copying...");
    }
}

