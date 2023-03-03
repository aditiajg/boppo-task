package com.boppo.task.services;

import org.springframework.stereotype.Service;

import com.boppo.task.entities.Employee;
import com.boppo.task.web.dto.EmployeeRegistrationDto;
import com.boppo.task.web.dto.UserRegistrationDto;

@Service
public interface EmployeeService {
	Employee save(EmployeeRegistrationDto employeeregistrationDto);
}
