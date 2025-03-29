package com.anirudh;

public class Laptop implements Computer {
    private int laptopId;
    @Override
    public void compile() {
        System.out.println("Laptop: Compiling the code...");
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }
}
