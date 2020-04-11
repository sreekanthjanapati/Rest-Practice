package com.restapi.model;

import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UsersInfo {

	private int id;
	@NotEmpty(message = "name should not be empty or null")
	private String name;
	private String lname;
	private String email;	

	
}
