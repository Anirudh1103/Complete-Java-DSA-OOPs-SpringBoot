package com.anirudh;

public class Alien {
    private int id;
    private Computer com;

    public Alien()
    {
        //System.out.println("Alien Object created");
    }
    public Alien(int id, Laptop com) {
        System.out.println("Alien: Constructor is called and values are initialized");
        this.id = id;
        this.com = com;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", com=" + com +
                '}';
    }
}
