package com.boppo.task.web.dto;

public class EmployeeRegistrationDto {
	
	private String employee_id;
	private String organization_name;
	
	public EmployeeRegistrationDto() {
		super();
	}

	public EmployeeRegistrationDto(String employee_id, String organization_name) {
		super();
		this.employee_id = employee_id;
		this.organization_name = organization_name;
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
		return "EmployeeRegistrationDto [employee_id=" + employee_id + ", organization_name=" + organization_name + "]";
	}
}
