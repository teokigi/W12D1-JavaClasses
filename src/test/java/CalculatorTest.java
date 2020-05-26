import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void canAdd(){
        assertEquals(4,calc.add(3,1), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(2,calc.subtract(3,1), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(6,calc.multiply(3,2), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(2,calc.divide(4,2), 0.01);
    }

}
