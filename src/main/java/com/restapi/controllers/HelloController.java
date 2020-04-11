package com.restapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/users")
public class HelloController {
	
	@GetMapping
	public String getUsersData() {
		
		return "kanth";
	}
	

}
