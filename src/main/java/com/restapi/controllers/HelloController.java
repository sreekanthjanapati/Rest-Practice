package com.restapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.User;
import com.restapi.service.HelloService;

@RestController
@RequestMapping("v1/users")
public class HelloController {
	
	@Autowired
	HelloService service;
	
	@GetMapping
	public List<User> getUsersData() {
		
		return service.getUsersInfo();
	}
	

}
