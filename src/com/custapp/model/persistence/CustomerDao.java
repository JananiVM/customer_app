package com.custapp.model.persistence;

import java.util.List;


import com.custapp.model.persistence.Customer;

public interface CustomerDao {
    public Customer addCustomer(Customer customer);
    public Customer getCustomerById(int bookId);
    public List<Customer> getAllCustomers();
    public Customer updateCustomer(Customer customer);
	public Customer removeCustomer(int customerId);
}
