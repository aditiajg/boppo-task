package com.boppo.task.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;



@Entity
@Table(name = "users_table")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int user_key;
	
	@Column(nullable = false)
	private String first_name;
	
	@Column(nullable = false)
	private String last_name;
	
	@Column(nullable = false)
	private String email_id;
	
	@Column(nullable = false)
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_key")
	private Employee uemp;
	

	public User() {
		super();
	}
	

	public User(String first_name, String last_name, String email_id, String password, Employee uemp) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_id = email_id;
		this.password = password;
		this.uemp = uemp;
	}




	public int getUser_key() {
		return user_key;
	}

	public void setUser_key(int user_key) {
		this.user_key = user_key;
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


	public Employee getUemp() {
		return uemp;
	}


	public void setUemp(Employee uemp) {
		this.uemp = uemp;
	}


	@Override
	public String toString() {
		return "User [user_key=" + user_key + ", first_name=" + first_name + ", last_name=" + last_name + ", email_id="
				+ email_id + ", password=" + password + ", uemp=" + uemp + "]";
	}

	
	
}
