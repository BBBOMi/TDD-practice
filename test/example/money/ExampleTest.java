package example.money;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Bomi
 * @date 2020/06/23
 */

public class ExampleTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

    @Test
    public void testMultiplication2() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
    
    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
    }
}