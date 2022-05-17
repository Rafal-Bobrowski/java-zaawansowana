package generic_types.ex2;

import java.util.function.Predicate;

public class Counter {

    public static <T> int countIf(T[] array, Predicate<T> predicate){
        int counter = 0;
        for(T element : array){
            if(predicate.test(element)){
                counter++;
            }
        }
        return counter;
    }
}
