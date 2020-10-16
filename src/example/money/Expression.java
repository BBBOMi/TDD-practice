package example.money;

/**
 * @author Bomi
 * @date 2020/08/20
 */

public interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
}
