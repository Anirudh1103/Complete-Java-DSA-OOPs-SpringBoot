package com.anirudh;

import org.springframework.stereotype.Component;

@Component
public class Square implements IShape{

    @Override
    public void area(double x, double y)
    {
        System.out.println("Area of Square: " + (x*x));
    }
}
