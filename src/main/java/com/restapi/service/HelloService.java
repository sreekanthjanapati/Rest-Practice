package com.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.model.User;
import com.restapi.utils.DataUtils;
import com.sun.tools.javac.util.List;

@Service
public class HelloService {
	
	DataUtils util;
	
	@Autowired
	HelloService(DataUtils util){
		this.util=util;
	}

	public List<User> getUsersInfo() throws NullPointerException {
		try {
			String name = null;
		//	name.toString();
		} catch (NullPointerException ex) {
			throw new NullPointerException("something went wrong please try after some time");
		}

		return util.getData();
	}

}
