package com.example.Low.Level.design.lsp;

public class Main {
    public static void main(String[] args) {
        File file = new File();
        file.read();
        file.write();


        //read-only file
        File readOnly = new File();
        readOnly.write();
    }

}
