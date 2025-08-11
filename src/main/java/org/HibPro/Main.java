package org.HibPro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


        Student s1 = new Student();
        s1.setRollid(103);
        s1.setName("Apoorva");
        s1.setCollege("GGCT");

        // System.out.println(s1);

        SessionFactory sessionFactory =  new Configuration().addAnnotatedClass(Student.class).configure().buildSessionFactory();            //cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();

        System.out.println(s1);



    }
}


