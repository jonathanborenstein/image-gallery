package com.example.image;

public class SiteUserForm {
	
	private String name;
	
	private String password;
	
	public SiteUserForm(){}

	public SiteUserForm(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
