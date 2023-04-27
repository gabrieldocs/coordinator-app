package coordinator.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calculator2Test {
    @Test
    public void testSum() {        
        Calculator2 c = new Calculator2();
        assertEquals(3, c.sum(1, 2));
    }

    @Test
    public void testSub() {
        Calculator2 c = new Calculator2();
        assertEquals(-1, c.sub(1, 2));
    }

}
