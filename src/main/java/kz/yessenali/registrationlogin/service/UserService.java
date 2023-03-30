package kz.yessenali.registrationlogin.service;

import kz.yessenali.registrationlogin.model.User;
import kz.yessenali.registrationlogin.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
