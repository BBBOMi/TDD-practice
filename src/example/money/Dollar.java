package example.money;

/**
 * @author Bomi
 * @date 2020/06/23
 */

public class Dollar extends Money {
    private String currency;

    Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    String currency() {
        return this.currency;
    }
}
