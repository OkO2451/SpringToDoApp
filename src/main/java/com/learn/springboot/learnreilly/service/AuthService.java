package com.learn.springboot.learnreilly.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public boolean authenticate(String username, String password) {
        if (username.equals("admin") && password.equals("admin") ||
                username.equals("user") && password.equals("123")) {
            return true;
        }
        return false;
    }

    // public no args constructor because it doesnt work
    public AuthService() {
        super();
    }

}
