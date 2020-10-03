package example.money;

/**
 * @author Bomi
 * @date 2020/08/20
 */

public class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    int rate(String from, String to) {
        return (from.equals("CHF") &&to.equals("USD")) ? 2 : 1;
    }
}
