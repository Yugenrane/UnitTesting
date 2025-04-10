package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.services.MsgServices;

@RestController
public class MsgController {
	
	@Autowired
	private MsgServices msgService;
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMsg(){
		return new ResponseEntity<>(msgService.welcomeMsg(), HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public ResponseEntity<String> greetMsg(){
		return new ResponseEntity<>(msgService.greetMsg(), HttpStatus.OK);
	}
}
