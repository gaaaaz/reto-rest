package com.entelgy.reto.entity;

public class Data {

	private Integer id;
	private String lastName;
	private String email;
	
	public Data() { }
	
	public Data(Integer id, String lastName, String email) {
		this.id = id;
		this.lastName = lastName;
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
