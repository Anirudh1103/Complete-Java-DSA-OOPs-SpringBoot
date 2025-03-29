package com.anirudh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.anirudh");
        Employee employee = context.getBean(Employee.class);
        Address address = context.getBean(Address.class);
        employee.setEmpName("Anirudh");
        employee.printDetails();
    }
}
