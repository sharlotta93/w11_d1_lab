import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(4, calculator.add(2.0, 2.0), 0.01);
    }

    @Test
    public void canSubtract() {
        assertEquals(3.4, calculator.subtract(5.5, 2.1), 0.01);
    }

    @Test
    public void canMultiply() {
        assertEquals(10, calculator.multiply(5, 2), 0.01);
    }

    @Test
    public void canDivide() {
        assertEquals(5, calculator.divide(15, 3), 0.01);
    }
}
