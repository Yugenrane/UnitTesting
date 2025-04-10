package com.example.servicesTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.Customer;
import com.example.services.CustomerService;

@SpringBootTest
public class CustomerServiceTest {
	@Autowired
	private CustomerService customerService;
	
	@Test
	public void saveCustomerTest1() {
		Customer customer=new Customer();
		customer.setId(101);
		customer.setName("Sonal Rane");
		customer.setEmail("ranesonal@gmail.com");
		Boolean saveCustomer = customerService.saveCustomer(customer);
		assertTrue(saveCustomer);
	}
	
	@Test
	public void saveCustomerTest2() {
		Customer customer = new Customer();
		Boolean saveCustomer = customerService.saveCustomer(customer);
		assertFalse(saveCustomer);
	}
	
	@Test
	public void saveCustomerTest3() {
		Customer customer=new Customer();
		customer.setId(null);
		customer.setName("Yugen");
		customer.setEmail("raneyug@gmail.com");
		Boolean saveCustomer = customerService.saveCustomer(customer);
		assertFalse(saveCustomer);
	}
	@Test
	public void saveCustomerTest4() {
		Customer customer=new Customer();
		customer.setId(101);
		customer.setName(null);
		customer.setEmail("raneyug@gmail.com");
		Boolean saveCustomer = customerService.saveCustomer(customer);
		assertFalse(saveCustomer);
	}
	@Test
	public void saveCustomerTest5() {
		Customer customer=new Customer();
		customer.setId(101);
		customer.setName("Yugen");
		customer.setEmail(null);
		Boolean saveCustomer = customerService.saveCustomer(customer);
		assertFalse(saveCustomer);
	}
}





















