package example.money;

/**
 * @author Bomi
 * @date 2020/06/25
 */

public class Money {
    protected int amount;
    protected String currency;

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    String currency() {
        return currency;
    }

    Money plus(Money added) {
        return new Money(amount + added.amount, currency);
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount
                && currency().equals(money.currency());
    }

    public String toString() {
        return amount + " " + currency;
    }
}
