package example.money;

/**
 * @author Bomi
 * @date 2020/06/25
 */

public class Franc {
    private int amount;

    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object o) {
        Franc franc = (Franc)o;
        return this.amount == franc.amount;
    }
}
