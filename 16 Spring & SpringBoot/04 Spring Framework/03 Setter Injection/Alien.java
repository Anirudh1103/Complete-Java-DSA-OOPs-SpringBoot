package com.anirudh;

public class Alien {
    private int id;
    private Laptop lap;

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public Alien() {
        System.out.println("Alien Object Created....");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("setter is called!!");
        this.id = id;
    }

    public void code()
    {
        System.out.println("Alien is coding!!!!!!!");
        lap.compile();
    }
}
