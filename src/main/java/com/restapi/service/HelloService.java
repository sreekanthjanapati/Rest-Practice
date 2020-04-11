package com.restapi.service;

import org.springframework.stereotype.Service;

import com.restapi.model.User;
import com.sun.tools.javac.util.List;

@Service
public class HelloService {

	
  public List<User> getUsersInfo(){
		return List.of(new User(3,"three"),new User(1,"one"),new User(2,"two"));
	}
	
}
