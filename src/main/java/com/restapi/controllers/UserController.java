package com.restapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.User;
import com.restapi.model.UsersInfo;
import com.restapi.service.HelloService;

@RestController
@RequestMapping("v1/users")
public class UserController {

	@Autowired
	HelloService service;

	@GetMapping
	public List<User> getUsersData(@ModelAttribute UsersInfo info) {

		System.out.println("name in the request param is:: " + info);
		return service.getUsersInfo();
	}
	
	public ResponseEntity<User> insertUsersData(@RequestBody User user) {
		System.out.println("Got the users data from client :: "+user);
		return ResponseEntity.ok().body(user);
		
	}
}
