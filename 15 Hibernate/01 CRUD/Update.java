package com.anirudh;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.text.CompactNumberFormat;

public class Update {
    public static void main(String[] args) {
        Session session = new Configuration().addAnnotatedClass(com.anirudh.Student.class).configure()
                .buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Student st3 = session.get(Student.class, 6);
        st3.setName("Anirudh C M");
        st3.setMarks(95);

        transaction.commit();
        session.close();
    }
}
