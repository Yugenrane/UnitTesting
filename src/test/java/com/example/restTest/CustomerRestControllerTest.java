package com.example.restTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.dao.Customer;
import com.example.rest.CustomerRestController;
import com.example.services.CustomerService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(controllers= {CustomerRestController.class})
public class CustomerRestControllerTest {
	@MockBean
	private CustomerService customerService;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void saveCustomerTest() throws Exception {
		Customer customer=new Customer();
		customer.setId(101);
		customer.setName("Yugen Rane");
		customer.setEmail("raneyug@gmail.com");
		when(customerService.saveCustomer(any(Customer.class))).thenReturn(true);
		
		ObjectMapper mapper=new ObjectMapper();
		String customerJSON = mapper.writeValueAsString(customer);
		
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/addCustomer")
								.contentType("application/json")
								.content(customerJSON);
		MvcResult result = mockMvc.perform(request).andReturn();
		MockHttpServletResponse response = result.getResponse();
		String contentAsString = response.getContentAsString();
		assertEquals("Customer saved", contentAsString);
	}
	
	@Test
	public void saveCustomerTest2() throws Exception {
		Customer customer=new Customer();
		when(customerService.saveCustomer(customer)).thenReturn(false);
		
		ObjectMapper mapper=new ObjectMapper();
		String customerJSON=mapper.writeValueAsString(customer);
		
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/addCustomer")
								.contentType("application/json")
								.content(customerJSON);
		MvcResult result = mockMvc.perform(request).andReturn();
		MockHttpServletResponse response = result.getResponse();
		String contentAsString = response.getContentAsString();
		assertEquals("Customer not saved", contentAsString);
		
	}
}
