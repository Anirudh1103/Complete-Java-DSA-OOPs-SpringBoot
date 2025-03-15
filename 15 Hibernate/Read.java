package com.anirudh;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Read {
    public static void main(String[] args) {
        //Code for performing Read operating using hibernate
        Session session = new Configuration().addAnnotatedClass(com.anirudh.Student.class).configure()
                .buildSessionFactory().openSession();

        Student s2 = session.get(Student.class,6);
        System.out.println(s2);
    }
}
