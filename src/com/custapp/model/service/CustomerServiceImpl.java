package com.custapp.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.custapp.model.persistence.Customer;
import com.custapp.model.persistence.CustomerDao;
import com.custapp.model.persistence.CustomerNotFoundException;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer addCustomer(Customer customer) {
		return customerDao.addCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}

	@Override
	public Customer getCustomerById(int customerId) {
		Customer customer = customerDao.getCustomerById(customerId);
		if (customer == null)
			throw new CustomerNotFoundException("customer with id:" + customer
					+ " is not found");
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}

	@Override
	public Customer removeCustomer(int customerId) {
		return customerDao.removeCustomer(customerId);
	}
	}
	


