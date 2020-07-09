package example.money;

/**
 * @author Bomi
 * @date 2020/06/25
 */

abstract public class Money {
    protected int amount;

    abstract Money times(int multiplier);

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount
                && getClass().equals(money.getClass());
    }
}
