# Terminal Calculator Project for SWE 202 SOFTWARE VERIFICATION AND
VALIDATION

A Java application with a terminal-based calculator.

## Features

- Interactive command-line calculator
- Supports basic operations: addition, subtraction, multiplication, and division
- Continuous calculation with previous results
- Input validation

## Building the project

```
mvn clean package
```

## Running the application

```
java -jar target/java-project-1.0-SNAPSHOT.jar
```

Alternatively, you can run directly with:

```
java -cp target/classes com.example.TerminalCalculator
```

## Running tests

```
mvn test
```

## Usage Instructions

1. Enter a number when prompted
2. Choose an operation (+, -, *, /)
3. Enter a second number
4. View the result
5. Continue with operations on the result or enter 'q' to quit 
