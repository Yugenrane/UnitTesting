package com.example.servicesTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.services.MsgServices;

@SpringBootTest
public class MsgServiceTest {
	
	@Autowired
	private MsgServices msgServices;
	
	@Test
	public void welcomeMsgTest() {
		assertNotNull(msgServices.welcomeMsg());
	}
	
	@Test
	public void greetMsgTest() {
		assertNotNull(msgServices.greetMsg());
	}
}
