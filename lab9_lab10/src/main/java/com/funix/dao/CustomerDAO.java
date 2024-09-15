package com.funix.dao;

import java.util.List;

import com.funix.entity.Customer;

public interface CustomerDAO {
	List<Customer> getCustomer();
	void save(Customer customer);
	Customer findById(int id);
	void delete(int id);
}
