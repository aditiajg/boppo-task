package com.boppo.task.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employees_table")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee_key;
	
	@Column(nullable = false)
	private String employee_id;
	
	@Column(nullable = false)
	private String organization_name;


	public Employee() {
		super();
	}

	public Employee(String employee_id, String organization_name) {
		super();
		this.employee_id = employee_id;
		this.organization_name = organization_name;
	}

	public int getEmployee_key() {
		return employee_key;
	}

	public void setEmployee_key(int employee_key) {
		this.employee_key = employee_key;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getOrganization_name() {
		return organization_name;
	}

	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}

	@Override
	public String toString() {
		return "Employee [employee_key=" + employee_key + ", employee_id=" + employee_id + ", organization_name="
				+ organization_name + "]";
	}
	
	
}
