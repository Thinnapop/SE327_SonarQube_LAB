package se327;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(5, 5));
    }
    @Test
     void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.substract(15, 5));
    }
    @Test
     void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.multiply(5, 5));
    }
    @Test
     void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(4, 2),0.01);
    }
    @Test
     void divideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class,() -> calculator.divide(10,0));
    }

}
