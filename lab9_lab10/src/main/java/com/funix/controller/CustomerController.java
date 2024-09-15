package com.funix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.funix.dao.CustomerDAO;
import com.funix.entity.Customer;
import com.funix.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomer(Model theModel) {
		List<Customer> customers = customerService.getCustomer();
		theModel.addAttribute("customers", customers);
		return "list-customers";
	}
	
	@GetMapping("/show-form-for-add")
	public String showFormForAdd(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		return "customer-form-add";
	}
	
	@PostMapping("/add-customer")
	public String addCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.save(customer);
		return "redirect:/customer/list";
	}
	@GetMapping("/show-form-for-update")
	public String showFormForUpdate(@RequestParam("customerId") int id, Model theModel) {
		Customer customer = customerService.findById(id);
		theModel.addAttribute("customer",customer);
		return "customer-form-add";
	}
	
	@PostMapping("/update")
	public String updateCustomer(@RequestParam("customerId") int id) {
		Customer customer = customerService.findById(id);
		customerService.save(customer);
		return "redirect:/customer/list";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("customerId") int id) {
		customerService.delete(id);
		return "redirect:/customer/list";
	}

}
