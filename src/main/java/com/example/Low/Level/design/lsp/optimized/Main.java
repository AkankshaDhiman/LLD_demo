package com.example.Low.Level.design.lsp.optimized;

public class Main {
    public static void main(String[] args) {
        ReadbleFile rf = new ReadbleFile();
        ReadOnlyFile rof = new ReadOnlyFile();
        WritableFile wrf = new WritableFile();

        rof.read();
        rf.read();
        wrf.read();
        wrf.write();
    }
}
