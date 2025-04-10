package com.example.restTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

import com.example.rest.MsgController;
import com.example.services.MsgServices;

@WebMvcTest(controllers = {MsgController.class})
public class MsgControllerTest {
	@MockBean
	private MsgServices msgServices;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void welcomeMsgTest() throws Exception {
		when(msgServices.welcomeMsg()).thenReturn("Dummy Welcome Msg");
		MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/welcome");
		MvcResult result = mockMvc.perform(req).andReturn();
		MockHttpServletResponse response = result.getResponse();
		int status = response.getStatus();
		assertEquals(200, status);
	}
	
	@Test
	public void greetMsgTest() throws Exception {
		when(msgServices.greetMsg()).thenReturn("Dummy Greet Msg");
		MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/greet");
		MvcResult result = mockMvc.perform(req).andReturn();
		MockHttpServletResponse response = result.getResponse();
		int status = response.getStatus();
		assertEquals(200, status);
	}
}
