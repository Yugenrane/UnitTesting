package com.example.services;

import org.springframework.stereotype.Service;

import com.example.dao.Customer;

@Service
public class CustomerService {
	public Boolean saveCustomer(Customer customer) {
		if(customer.getId()!= null && customer.getName()!=null && customer.getEmail()!=null)
			return true;
		return false;
	}
}
