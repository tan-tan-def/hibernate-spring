package com.example.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

    public static void main(String[] args) {
    	System.out.println("Hello");
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            System.out.println("Creating a new student object...");
            Student tempStudent = new Student("Paul", "Wall", "paul@luv2code.com");
            
            session.beginTransaction();
            
            System.out.println("Saving a student...");
            session.save(tempStudent);
            
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }  
}

