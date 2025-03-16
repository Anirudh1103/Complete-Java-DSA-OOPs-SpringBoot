package com.anirudh;

import jakarta.persistence.*;

import java.util.List;

@Entity()
public class Alien {
    @Id
    private int id;
    private  String name;
    private String technology;
    @OneToOne
    private Laptop laptop;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", technology='" + technology + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
