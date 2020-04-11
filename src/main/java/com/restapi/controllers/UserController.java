package com.restapi.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.exceptions.UserServiceExcepiton;
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

		List<User> al = new ArrayList<>();
		System.out.println("name in the request param is:: " + info);

		// if(true) throw new UserServiceExcepiton("User Service exception raised");

		al = service.getUsersInfo();

		return al;
	}

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<UsersInfo> insertUsersData(@Valid @RequestBody UsersInfo user) {
		System.out.println("Got the users data from client :: " + user);
		return ResponseEntity.ok().body(user);

	}
}
