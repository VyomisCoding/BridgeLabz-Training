package com.junit;

public class UserRegistration{
    public boolean registerUser(String username, String email, String password){
        if (username == null || username.isEmpty())
            throw new IllegalArgumentException("Username is required");
        
        if (email == null || !email.contains("@"))
            throw new IllegalArgumentException("Invalid email");
        
        if (password == null || password.length() < 6)
            throw new IllegalArgumentException("Weak password");
        
        return true; // registration successful
    }
}
