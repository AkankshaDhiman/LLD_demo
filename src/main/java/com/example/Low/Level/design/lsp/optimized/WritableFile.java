package com.example.Low.Level.design.lsp.optimized;

public class WritableFile extends ReadbleFile implements Writable {
    @Override
    public void write(){
        System.out.println("writing to file");
    }
}
