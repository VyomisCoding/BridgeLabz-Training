package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

// Test class to verify methods inside StringUtils class
public class StringUtilsTest{
    @Test
    public void testReverse(){
        assertEquals("cba", StringUtils.reverse("abc")); // simple reverse
        assertEquals("", StringUtils.reverse(""));       // empty string
        assertNull(StringUtils.reverse(null));           // null case
    }

    @Test
    public void testIsPalindrome(){
        assertTrue(StringUtils.isPalindrome("madam"));       // true palindrome
        assertTrue(StringUtils.isPalindrome("RaceCar"));     // case-insensitive
        assertFalse(StringUtils.isPalindrome("hello"));      // not palindrome
        assertFalse(StringUtils.isPalindrome(null));         // null string
    }

    @Test
    public void testToUpperCase(){
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        assertEquals("", StringUtils.toUpperCase(""));       // empty string
        assertNull(StringUtils.toUpperCase(null));           // null case
    }
}
