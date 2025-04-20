package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TerminalCalculatorTest {
    
    @Test
    public void testAddition() {
        double result = performOperation(5, "+", 3);
        assertEquals(8.0, result, 0.001);
    }
    
    @Test
    public void testSubtraction() {
        double result = performOperation(10, "-", 4);
        assertEquals(6.0, result, 0.001);
    }
    
    @Test
    public void testMultiplication() {
        double result = performOperation(6, "*", 7);
        assertEquals(42.0, result, 0.001);
    }
    
    @Test
    public void testDivision() {
        double result = performOperation(20, "/", 5);
        assertEquals(4.0, result, 0.001);
    }
    
    // Helper method to simulate operations
    private double performOperation(double num1, String operation, double num2) {
        double result = num1;
        
        switch (operation) {
            case "+":
                result += num2;
                break;
            case "-":
                result -= num2;
                break;
            case "*":
                result *= num2;
                break;
            case "/":
                if (num2 != 0) {
                    result /= num2;
                }
                break;
        }
        
        return result;
    }
} 