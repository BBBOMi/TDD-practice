package example.money;

/**
 * @author Bomi
 * @date 2020/06/25
 */

abstract public class Money {
    protected int amount;

    abstract Money times(int multiplier);

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount
                && getClass().equals(money.getClass());
    }
}
