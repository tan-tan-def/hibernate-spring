package com.example.hibernate.demo.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ListStudentDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
    			.configure("hibernate.cfg.xml")
    			.addAnnotatedClass(Student.class)
    			.buildSessionFactory();
    	
    	try {
    		Session session = factory.getCurrentSession();
    		session.beginTransaction();
    		List<Student> students = session.createQuery("from Student").getResultList();
    		for(Student s: students) {
    			System.out.println(s);
    		}
    		session.getTransaction().commit();
    		
    	}finally {
    		factory.close();
    	}
	}
}
