package com.junit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest{

    @Test
    public void testValidPassword(){
        PasswordValidator pv = new PasswordValidator();
        assertTrue(pv.isValid("StrongPass1"));
    }

    @Test
    public void testShortPassword(){
        PasswordValidator pv = new PasswordValidator();
        assertFalse(pv.isValid("Ab1"));
    }

    @Test
    public void testNoUppercase(){
        PasswordValidator pv = new PasswordValidator();
        assertFalse(pv.isValid("password1"));
    }

    @Test
    public void testNoDigit(){
        PasswordValidator pv = new PasswordValidator();
        assertFalse(pv.isValid("PasswordX"));
    }
}
