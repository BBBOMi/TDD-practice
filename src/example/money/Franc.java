package example.money;

/**
 * @author Bomi
 * @date 2020/06/25
 */

public class Franc extends Money{

    Franc(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
