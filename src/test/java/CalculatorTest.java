import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3)); // Kiểm thử giá trị bình thường
        assertEquals(0, Calculator.add(0, 0)); // Kiểm thử với giá trị 0
        assertEquals(-1, Calculator.add(-2, 1)); // Kiểm thử với số âm
    }

    @Test
    public void testSubtract() {
        assertEquals(1, Calculator.subtract(3, 2)); // Kiểm thử giá trị bình thường
        assertEquals(0, Calculator.subtract(0, 0)); // Kiểm thử với giá trị 0
        assertEquals(-3, Calculator.subtract(-2, 1)); // Kiểm thử với số âm
    }

    @Test
    public void testMultiply() {
        assertEquals(6, Calculator.multiply(2, 3)); // Kiểm thử giá trị bình thường
        assertEquals(0, Calculator.multiply(0, 5)); // Kiểm thử với giá trị 0
        assertEquals(-6, Calculator.multiply(-2, 3)); // Kiểm thử với số âm
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.divide(6, 3)); // Kiểm thử giá trị bình thường
        assertEquals(0, Calculator.divide(0, 5)); // Kiểm thử với giá trị 0
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(5, 0)); // Kiểm thử ngoại lệ
    }

    // Kiểm thử biên cho phương thức divide
    @Test
    public void testDivideBoundaryValues() {
        assertEquals(1, Calculator.divide(1, 1)); // Giá trị biên
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(1, 0)); // Giá trị không hợp lệ
    }

    // Kiểm thử ngoại lệ cho phương thức divide
    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(5, 0), "Division by zero should throw an exception");
    }
}