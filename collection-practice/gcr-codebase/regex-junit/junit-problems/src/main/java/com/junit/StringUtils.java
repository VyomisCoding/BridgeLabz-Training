package com.junit;

public class StringUtils{
    public static String reverse(String str){             // Method 1: Reverse a given string
        if (str == null) return null;                     // handle null case
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str){       // Method 2: Check if a string is palindrome
        if (str == null) return false;
        return str.equalsIgnoreCase(reverse(str));        // A string is palindrome if it equals its reverse
    }

    public static String toUpperCase(String str){         // Method 3: Convert string to uppercase
        if (str == null) return null;
        return str.toUpperCase();
    }
}
