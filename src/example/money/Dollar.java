package example.money;

import java.util.Objects;

/**
 * @author Bomi
 * @date 2020/06/23
 */

public class Dollar {
    private int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        Dollar dollar = (Dollar)object;
        return this.amount == dollar.amount;
    }
}
