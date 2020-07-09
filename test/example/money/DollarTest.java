package example.money;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bomi
 * @date 2020/06/23
 */

public class DollarTest {

    @Test
    public void testMultiplication2() {
        Money five = Money.dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}