package com.custapp.model.service;

import java.util.List;

import com.custapp.model.persistence.Customer;

	public interface CustomerService {
	    public Customer addCustomer(Customer customer);
	    public List<Customer> getAllCustomers();
	    public Customer getCustomerById(int bookId);
	    public Customer updateCustomer(Customer customer);
		public Customer removeCustomer(int customerId);
	}
