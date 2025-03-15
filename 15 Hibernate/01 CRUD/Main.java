package com.anirudh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(8);
        s1.setMarks(80);
        s1.setName("Chandana");

        Session session = new Configuration().addAnnotatedClass(com.anirudh.Student.class).configure()
                        .buildSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);
        transaction.commit();
        session.close();
        System.out.println(s1);
    }
}
