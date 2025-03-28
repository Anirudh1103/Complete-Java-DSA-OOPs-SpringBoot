package com.anirudh;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Alien a1 = new Alien();
        Session session = new Configuration().addAnnotatedClass(com.anirudh.Alien.class).configure()
                .buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Laptop l1 = new Laptop();
        l1.setBrand("Lenovo");
        l1.setModel("Legion 5i");
        l1.setRan(16);

        a1.setId(1);
        a1.setName("Amith");
        a1.setTechnology("Java");
        a1.setLaptop(l1);
        session.persist(a1);

        transaction.commit();
        session.close();
        System.out.println(a1);
    }
}
