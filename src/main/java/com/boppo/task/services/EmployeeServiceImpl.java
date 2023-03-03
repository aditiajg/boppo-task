package com.boppo.task.services;

import com.boppo.task.entities.Employee;
import com.boppo.task.repositories.EmployeeRepository;
import com.boppo.task.web.dto.EmployeeRegistrationDto;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	

	public EmployeeServiceImpl( EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public Employee save(EmployeeRegistrationDto employeeregistrationDto) {
		Employee emp = new Employee(employeeregistrationDto.getEmployee_id(),
				employeeregistrationDto.getOrganization_name());
		
		return employeeRepository.save(emp);
	}

}
