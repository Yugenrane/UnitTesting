package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.Customer;
import com.example.services.CustomerService;

@RestController
public class CustomerRestController {
	@Autowired
	private CustomerService customerService; 
	
	@PostMapping("/addCustomer")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer){
		Boolean value = customerService.saveCustomer(customer);
		if(value)
			return new ResponseEntity<>("Customer saved", HttpStatus.OK);
		return new ResponseEntity<>("Customer not saved", HttpStatus.BAD_REQUEST);
	}
}
