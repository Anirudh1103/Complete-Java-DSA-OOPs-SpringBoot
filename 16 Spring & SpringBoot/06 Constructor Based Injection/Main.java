package com.vehichle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.vehichle");
        Vehichle vehichle = context.getBean(Vehichle.class);
        vehichle.showInsurance();
    }
}
