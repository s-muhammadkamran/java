package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String userName, String passwrod) {
        boolean isValidUserName = userName.trim().equalsIgnoreCase("Kamran");
        boolean isValidPassword = passwrod.trim().equals("kamran");

        return isValidUserName && isValidPassword;
    }
}
