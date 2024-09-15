package com.example.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentDemo {
	public void main(String[] args) {
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
        	session.beginTransaction();
        	session.createQuery("delete from Student where id=1").executeUpdate();
        	session.getTransaction().commit();
        }finally {
			factory.close();
		}
	}
}
