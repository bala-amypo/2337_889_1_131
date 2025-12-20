package com.example.demo.security;

import com.example.demo.entity.AppUser;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {
    public String createToken(AppUser user) {
        // Return a dummy token for now to pass compilation
        return "dummy-jwt-token-for-" + user.getEmail();
    }
}