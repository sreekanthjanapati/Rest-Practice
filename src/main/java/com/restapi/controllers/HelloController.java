package com.restapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/users")
public class HelloController {
	
	
	public String getUsersData() {
		
		return "sreekanth";
	}
	

}
