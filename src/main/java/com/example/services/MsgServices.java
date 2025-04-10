package com.example.services;

import org.springframework.stereotype.Service;

@Service
public class MsgServices {
	
	public String welcomeMsg() {
		return "Welcome to my world";
	}
	
	public String greetMsg() {
		return "Good Morning";
	}
	
}
