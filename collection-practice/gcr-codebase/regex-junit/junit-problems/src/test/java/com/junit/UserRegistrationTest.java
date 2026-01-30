package com.junit;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest{
    @Test
    public void testValidRegistration(){
        UserRegistration reg = new UserRegistration();
        assertTrue(reg.registerUser("Vyom", "vyom@gmail.com", "secret123"));
    }

    @Test
    public void testInvalidUsername(){
        UserRegistration reg = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> {
            reg.registerUser("", "test@gmail.com", "password");
        });
    }

    @Test
    public void testInvalidEmail(){
        UserRegistration reg = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> {
            reg.registerUser("Vyom", "wrongEmail", "password");
        });
    }

    @Test
    public void testWeakPassword(){
        UserRegistration reg = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> {
            reg.registerUser("Vyom", "vyom@gmail.com", "123");
        });
    }
}
