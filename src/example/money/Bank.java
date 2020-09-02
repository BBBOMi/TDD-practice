package example.money;

/**
 * @author Bomi
 * @date 2020/08/20
 */

public class Bank {
    Money reduce(Expression source, String to) {
        Sum sum = (Sum) source;
        return sum.reduce(to);
    }
}
