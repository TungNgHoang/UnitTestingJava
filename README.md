# Unit Testing with Java

This repository demonstrates unit testing in Java using JUnit. The project includes a simple calculator class and its corresponding unit tests.

## Source Code
### Main Class
The main class, `Calculator`, provides basic arithmetic operations. Example:
```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
```
### Tess Class
```java
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

