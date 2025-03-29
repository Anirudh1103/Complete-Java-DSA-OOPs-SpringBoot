package com.anirudh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
    private IShape shape;

    @Autowired
    //Autowiring by type
    @Qualifier("triangle")
    public void setShape(IShape shape) {
        this.shape = shape;
    }
    //Autowiring by name
    @Autowired
    private IShape square;
    public void printArea(double x, double y)
    {
        shape.area(x,y);
        square.area(10,20);
    }
}
