package com.boppo.task.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boppo.task.entities.Employee;
import com.boppo.task.entities.User;
import com.boppo.task.repositories.UserRepository;
import com.boppo.task.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	@Override
	public User save(UserRegistrationDto userRegistrationDto) {
		User user = new User(userRegistrationDto.getFirst_name(), userRegistrationDto.getLast_name(),
				userRegistrationDto.getEmail_id(), userRegistrationDto.getPassword(), 
				userRegistrationDto.getEmp());
		
		return userRepository.save(user);
	}
	
	

}
