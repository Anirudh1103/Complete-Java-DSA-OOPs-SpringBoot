package com.anirudh;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Rectangle implements IShape{
    @Override
    public void area(double x, double y)
    {
        System.out.println("Area of rectangle: " + (x * y));
    }
}
