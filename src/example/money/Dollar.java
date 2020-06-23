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

    void times(int multiplier) {
        amount *= 2;
    }

}
