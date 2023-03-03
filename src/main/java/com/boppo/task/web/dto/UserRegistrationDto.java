package com.boppo.task.web.dto;

import com.boppo.task.entities.Employee;

public class UserRegistrationDto {

	private String first_name;
	private String last_name;
	private String email_id;
	private String password;
	private Employee emp;
	
	
	public UserRegistrationDto() {
		super();
	}

	

	public UserRegistrationDto(String first_name, String last_name, String email_id, String password,
			Employee emp) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_id = email_id;
		this.password = password;
		this.emp = emp;
	}



	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public Employee getEmp() {
		return emp;
	}



	public void setEmp(Employee emp) {
		this.emp = emp;
	}



	@Override
	public String toString() {
		return "UserRegistrationDto [first_name=" + first_name + ", last_name=" + last_name + ", email_id=" + email_id
				+ ", password=" + password + ", emp=" + emp+ "]";
	}

	
}
