package com.example.demo;

public class Task {
	public String firstname;
	public String lastname;
	public String email;
	public String username;
	public String password;
	public String confirmpassword;
	
	public Task() {
		
	}

	public Task(String firstname,String lastname,String email,String username,String password,String confirmpassword) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		this.username=username;
		this.password=password;
		this.confirmpassword=confirmpassword;
	}
	
	public String getFirstname() {
		return firstname;
		
	}
	public void setFirstname(String firstname) {
		this.firstname=firstname;
	}
	public String getLastname() {
		return lastname;
		
	}
	public void setLastname(String lastname) {
		this.lastname=lastname;
	}
	public String getEmail() {
		return email;
		
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getUsername() {
		return username;
		
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public String getPassword() {
		return password;
		
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
		
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword=confirmpassword;
	}
}
