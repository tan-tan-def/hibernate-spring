package com.hibernate.advance.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.advance.entity.Course;
import com.hibernate.advance.entity.Instructor;
import com.hibernate.advance.entity.InstructorDetail;

public class Main {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
//			InstructorDetail detail = new InstructorDetail("MyChannel", "Gardening");
//			Instructor instructor = new Instructor("John", "Doe", "john.doe@example.com", detail);
//			Course course = new Course("JavaScript", instructor);
//			session.beginTransaction();
//			
//			session.save(instructor);
//			session.save(course);
//			session.getTransaction().commit();
			
			session.beginTransaction();
			Instructor  instructor = session.get(Instructor.class, 1);
			System.out.println(instructor);			
			session.getTransaction().commit();
			session.close();
			
		}finally {
			factory.close();
		}
	}

}
