package example.money;

/**
 * @author Bomi
 * @date 2020/09/02
 */

public class Sum implements Expression {
    Money augend;
    Money addend;

    Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }
}