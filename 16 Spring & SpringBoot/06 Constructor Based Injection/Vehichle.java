package com.vehichle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehichle {
    private String model;
    private String brand;
    private Insurance insurance;
    @Autowired
    public Vehichle(Insurance insurance) {
        super();
        this.insurance = insurance;
    }
    @Value("i7")
    public void setModel(String model) {
        this.model = model;
    }
    @Value("BMW")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void showInsurance()
    {
        System.out.println("Printing insurance");
        System.out.println(insurance.getType());
    }
}
