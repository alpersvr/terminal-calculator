package com.example;

import java.util.Scanner;

public class TerminalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        boolean firstOperation = true;


        System.out.println("Terminal Calculator");
        System.out.println("Operations: +, -, *, /");
        System.out.println("Enter 'q' to quit");

        while (true) {
            // Get first number or use previous result
            if (firstOperation) {
                System.out.print("Enter the first number: ");
                try {
                    result = Double.parseDouble(scanner.nextLine());
                    firstOperation = false;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number! Please enter a valid number.");
                    continue;
                }
            }

            // Get operation
            System.out.print("Enter operation (+, -, *, / or q): ");
            String operation = scanner.nextLine();

            // Check for quit command
            if (operation.equalsIgnoreCase("q")) {
                System.out.println("Calculator shutting down...");
                break;
            }

            // Validate operation
            if (!operation.equals("+") && !operation.equals("-") && 
                !operation.equals("*") && !operation.equals("/")) {
                System.out.println("Invalid operation! Please enter +, -, *, / or q.");
                continue;
            }

            // Get second number
            System.out.print("Enter the second number: ");
            double number;
            try {
                number = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number! Please enter a valid number.");
                continue;
            }

            // Perform calculation
            switch (operation) {
                case "+":
                    result += number;
                    break;
                case "-":
                    result -= number;
                    break;
                case "*":
                    result *= number;
                    break;
                case "/":
                    if (number == 0) {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                    result /= number;
                    break;
            }

            
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
} 