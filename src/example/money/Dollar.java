package example.money;

/**
 * @author Bomi
 * @date 2020/06/23
 */

public class Dollar {
    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
