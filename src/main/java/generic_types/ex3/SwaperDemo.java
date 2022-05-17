package generic_types.ex3;

import java.util.Arrays;

public class SwaperDemo {
    public static void main(String[] args) {
        Integer[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Swaper.swap(array, 3, 7);
        System.out.println(Arrays.toString(array));
    }
}
