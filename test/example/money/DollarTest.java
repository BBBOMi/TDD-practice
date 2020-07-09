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
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
    }
}