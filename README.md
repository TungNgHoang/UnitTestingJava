# Unit Testing with Java: A org.example.Calculator Application

This repository demonstrates the use of **JUnit** for unit testing in Java through a simple calculator application. It includes the implementation of basic arithmetic operations and corresponding test cases to validate functionality.

## Project Overview

The purpose of this project is to:
- Understand the basics of unit testing using JUnit.
- Demonstrate how to write and execute test cases for Java applications.
- Provide a foundation for building robust Java applications with test coverage.

## Features
- **Simple org.example.Calculator Class**: Implements basic arithmetic operations.
- **JUnit Test Cases**: Ensures correctness of implemented methods.

---

## Prerequisites

- **Java Development Kit (JDK)**: Version 8 or later.
- **JUnit**: Version 5 (JUnit Jupiter).
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor with build tools (e.g., Maven, Gradle).

---

## Source Code

### Main Class: org.example.Calculator

The `org.example.Calculator` class provides a simple implementation of an addition operation.  
More operations (e.g., subtraction, multiplication, division) can be added easily.

```java
public class org.example.Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
```

### Test Class

```java
import org.example.Calculator;

class CalculatorTest {
    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }
}
```
## Test Results
![image](https://github.com/user-attachments/assets/49f26147-aa93-4531-ba9a-1c8578a24f13)

## ChatGPT Link
https://chatgpt.com/share/677b5e6e-2854-8010-bcf6-74b90e23677f

