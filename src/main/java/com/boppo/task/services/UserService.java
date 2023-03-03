package com.boppo.task.services;

import com.boppo.task.entities.User;
import com.boppo.task.web.dto.UserRegistrationDto;

public interface UserService {

	User save(UserRegistrationDto registrationDto);
}
