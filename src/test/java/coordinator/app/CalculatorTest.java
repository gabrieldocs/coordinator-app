package coordinator.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testSum() {
        Calculator c = new Calculator();
        assertEquals(3, c.sum(1, 2));
    }
}
