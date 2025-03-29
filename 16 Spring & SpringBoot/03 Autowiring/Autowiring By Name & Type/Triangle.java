package com.anirudh;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Triangle implements IShape{
    @Override
    public void area(double x, double y)
    {
        System.out.println("Area of triangle: " + (0.5 * x * y));
    }
}
