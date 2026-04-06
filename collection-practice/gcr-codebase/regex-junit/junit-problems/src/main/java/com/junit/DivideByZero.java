package com.junit;

public class DivideByZero{
    // Method to divide two numbers
    public int divide(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return a / b;
    }
}
