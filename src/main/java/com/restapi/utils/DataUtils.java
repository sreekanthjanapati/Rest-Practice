package com.restapi.utils;

import org.springframework.stereotype.Service;

import com.restapi.model.User;
import com.sun.tools.javac.util.List;

@Service
public class DataUtils {
	
	
public	List<User> getData(){
	return	List.of(new User(3, "three"), new User(1, "one"), new User(2, "two"));
	}

}
