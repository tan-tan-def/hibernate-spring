package com.example.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		try {
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			Student student = session.get(Student.class, 1);
			
			student.setFirstName("Nam");
			session.getTransaction().commit();
		}finally {
			factory.close();
		}
	}

}
