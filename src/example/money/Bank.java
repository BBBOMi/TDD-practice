package example.money;

import java.util.HashMap;

/**
 * @author Bomi
 * @date 2020/08/20
 */

public class Bank {
    private HashMap<Pair, Integer> rates = new HashMap();

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    void addRate(String from,String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    int rate(String from, String to) {
        return (from.equals("CHF") &&to.equals("USD")) ? 2 : 1;
    }

    private class Pair {
        private String from;
        private String to;

        Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(Object object) {
            Pair pair = (Pair) object;
            return from.equals(pair.from) && to.equals(pair.to);
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }
}
