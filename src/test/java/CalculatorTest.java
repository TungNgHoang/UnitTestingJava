import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
        assertEquals(-1, Calculator.add(-2, 1));
        assertEquals(0, Calculator.add(0, 0));
    }

    @Test
    void testSubtract() {
        assertEquals(1, Calculator.subtract(3, 2));
        assertEquals(-3, Calculator.subtract(-2, 1));
        assertEquals(0, Calculator.subtract(0, 0));
    }

    @Test
    void testMultiply() {
        assertEquals(6, Calculator.multiply(2, 3));
        assertEquals(-2, Calculator.multiply(-2, 1));
        assertEquals(0, Calculator.multiply(0, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, Calculator.divide(6, 3));
        assertEquals(-2, Calculator.divide(-6, 3));
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(6, 0));
    }
}