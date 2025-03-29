package com.anirudh;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.anirudh");
        ShapeFactory factory = context.getBean(ShapeFactory.class);
        factory.printArea(10,20);
    }
}
