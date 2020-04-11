package com.restapi.model;

public class UsersInfo {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UsersInfo [name=" + name + "]";
	}

}
