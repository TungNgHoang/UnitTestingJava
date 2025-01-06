import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    @DisplayName("Subtract two numbers")
    void subtract() {
        // Test trường hợp trừ hai số
        assertEquals(2, Calculator.subtract(5, 3), "5 - 3 should equal 2");
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        // Test trường hợp nhân hai số
        assertEquals(6, Calculator.multiply(2, 3), "2 * 3 should equal 6");
    }

    @Test
    @DisplayName("Divide two numbers")
    void divide() {
        // Test trường hợp chia hai số dương
        assertEquals(2, Calculator.divide(6, 3), "6 / 3 should equal 2");
    }

    @Test
    @DisplayName("Divide by zero throws exception")
    void divideByZero() {
        // Test trường hợp chia cho 0
        assertThrows(IllegalArgumentException.class,
                () -> Calculator.divide(6, 0),
                "Dividing by zero should throw IllegalArgumentException");
    }
}