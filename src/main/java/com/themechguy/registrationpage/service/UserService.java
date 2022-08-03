package com.themechguy.registrationpage.service;

import com.themechguy.registrationpage.model.User;
import com.themechguy.registrationpage.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}
