package multi_thread.ex3;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SorterDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[10000];
        int[] array2 = new int[10000];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(20000);
            array2[i] = array1[i];
        }

        BubbleSorter bubbleSorter = new BubbleSorter(array1);
        InsertionSorter insertionSorter = new InsertionSorter(array2);
        String result = "";
        final ExecutorService executorService = Executors.newFixedThreadPool(2);

        try {
            result = executorService.invokeAny(List.of(bubbleSorter, insertionSorter));
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println(result);
        executorService.shutdown();
    }
}
