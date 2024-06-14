package com.rayyanshaikh.ecom.services.auth;

import com.rayyanshaikh.ecom.dto.SignupRequest;
import com.rayyanshaikh.ecom.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);

    Boolean hasUserWithEmail(String email);
}
