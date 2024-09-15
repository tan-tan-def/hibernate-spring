package com.funix.service;

import java.util.List;

import com.funix.entity.Customer;

public interface CustomerService {
	List<Customer> getCustomer();
	void save(Customer customer);
	Customer findById(int id);
	void delete(int id);
}
