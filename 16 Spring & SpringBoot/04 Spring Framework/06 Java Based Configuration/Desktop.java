package com.anirudh;

public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("Desktop: Compiling the code...");
    }
}
