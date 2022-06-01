import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    public void twoPlusTwoShouldEqualFour(){
        SimpleCalculator calculator=new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    public void threePlusSevenShouldEqualTen(){
        SimpleCalculator calculator=new SimpleCalculator();
        assertTrue(calculator.add(3,7)==10);
    }

}