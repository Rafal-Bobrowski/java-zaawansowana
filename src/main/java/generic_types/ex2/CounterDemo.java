package generic_types.ex2;

public class CounterDemo {
    public static void main(String[] args) {
        String[] words = new String[]{"cat", "dog", "dictionary", "table", "lamp"};
        System.out.println(Counter.countIf(words, (word) -> word.length() > 3));
    }
}
