package com.anirudh;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Alien a1 = new Alien();
        Session session = new Configuration().addAnnotatedClass(com.anirudh.Alien.class).configure()
                .addAnnotatedClass(com.anirudh.Laptop.class)
                .buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Laptop l1 = new Laptop();
        l1.setLid(101);
        l1.setBrand("Lenovo");
        l1.setModel("Legion 5i");
        l1.setRan(16);

        Laptop l2 = new Laptop();
        l2.setLid(102);
        l2.setBrand("Asus");
        l2.setModel("ROG");
        l2.setRan(8);

        a1.setId(1);
        a1.setName("Amith");
        a1.setTechnology("Java");
        a1.setLaptops(Arrays.asList(l1,l2));

        session.persist(l1);
        session.persist(l2);
        session.persist(a1);

        transaction.commit();
        session.close();
        System.out.println(a1);
    }
}
