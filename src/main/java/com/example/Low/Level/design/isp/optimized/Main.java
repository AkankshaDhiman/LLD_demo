package com.example.Low.Level.design.isp.optimized;

public class Main {
    public static void main(String[] args) {

        Printable printer = new Printer();
        printer.print();

        Scannable scanner = new Scanner();
        scanner.scan();

        MultiPurposeMachine mpm = new MultiPurposeMachine();
        mpm.print();
        mpm.scan();
        mpm.copy();
    }
}
