package com.funix.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.funix.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	@Autowired
	private SessionFactory factory;

	@Override
	public List<Customer> getCustomer() {
		Session session = factory.getCurrentSession();
		Query<Customer> theQuery = session.createQuery("FROM Customer c ORDER BY c.lastName DESC",Customer.class);
		List<Customer> customers = theQuery.getResultList();
		return customers;
	}

	@Override
	public void save(Customer customer) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(customer);
		
	}

	@Override
	public Customer findById(int id) {
		Session session = factory.getCurrentSession();
		Customer customer = session.get(Customer.class, id);
		return customer;
	}

	@Override
	public void delete(int id) {
		Session session = factory.getCurrentSession();
		Customer customer = session.get(Customer.class, id);
		session.delete(customer);
	}
}
