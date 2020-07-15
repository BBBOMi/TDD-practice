package example.money;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bomi
 * @date 2020/06/25
 */

public class FrancTest {

    @Test
    public void testMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));

        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testCurrency() {
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testDifferentClassEquality() {
        assertTrue(new Money(10, "CHF")
                .equals(new Franc(10, "CHF")));
    }
}
