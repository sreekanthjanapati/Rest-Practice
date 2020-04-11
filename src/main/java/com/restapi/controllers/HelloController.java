package com.restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.UsersInfo;
import com.restapi.service.HelloService;

@RestController
@RequestMapping("v1/hello")
public class HelloController {

	@Autowired
	HelloService service;

	@GetMapping
	public void getUsersData(@ModelAttribute UsersInfo info ) {

		 System.out.println("name in the request param is:: "+info);
		//return service.getUsersInfo();
	}

}
