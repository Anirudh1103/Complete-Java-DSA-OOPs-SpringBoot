package com.anirudh;

import jakarta.persistence.*;

import java.util.List;

@Entity()
public class Alien {
    @Id
    private int id;
    private  String name;
    private String technology;
    @OneToMany
    private List<Laptop> laptops;

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

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", technology='" + technology + '\'' +
                ", laptop=" + laptops +
                '}';
    }
}
