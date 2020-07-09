package example.money;

/**
 * @author Bomi
 * @date 2020/06/25
 */

public class Franc extends Money {
    private String currency;

    Franc(int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    String currency() {
        return this.currency;
    }
}
