package se327;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class AdvancedCaculatorTest {
    @Test
    void testPower(){
        AdvancedCalculator advancedCaculator = new AdvancedCalculator();
        assertEquals(8.0,advancedCaculator.power(2,3),0.01);
    }
    @Test
    void testSqrt(){
        AdvancedCalculator advancedCaculator = new AdvancedCalculator();
        assertEquals(2.0,advancedCaculator.sqrt(4),0.01);
    }
}
