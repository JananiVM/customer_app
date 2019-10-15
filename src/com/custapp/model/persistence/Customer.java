package com.custapp.model.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="custapp_table")
public class Customer {
	@Id
    @GeneratedValue
	private int id;
	@NotEmpty
    private String name;
	@NotEmpty
    private String address;
	@NotNull
    private String phoneNo;
	@Email
	@NotEmpty
    private String email;
    
	public Customer() {
	}

	public Customer(int id, String name, String address, String phoneNo, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	public Customer(String name, String address, String phoneNo, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + ", email="
				+ email + "]";
	}

	
	
}
