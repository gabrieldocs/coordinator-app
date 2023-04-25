package coordinator.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BannerTest {
    @Test
    public void test01()
    {
        String testString = "Salut, from the banner app!";
        Banner b = new Banner();
        assertTrue(testString.equals(b.salut()));
        assertEquals(testString, b.salut());
    }
}
