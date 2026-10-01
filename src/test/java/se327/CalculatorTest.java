package se327;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(5, 5));
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.substract(15, 5));
    }
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.multiply(5, 5));
    }
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(4, 2),0.01);
    }

}
