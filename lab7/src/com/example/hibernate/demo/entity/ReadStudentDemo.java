package com.example.hibernate.demo.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {

    public static void main(String[] args) {
    	SessionFactory factory = new Configuration()
    			.configure("hibernate.cfg.xml")
    			.addAnnotatedClass(Student.class)
    			.buildSessionFactory();
    	
    	try {
    		Session currentSession = factory.getCurrentSession();
    		currentSession.beginTransaction();
    		
    		Student student = currentSession.get(Student.class, 6);
    		
    		System.out.println(student);
    		
    		currentSession.getTransaction().commit();
    		
    	}finally {
    		factory.close();
    	}
    }  
}

