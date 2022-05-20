package multi_thread.ex3;

import java.util.concurrent.Callable;

public class BubbleSorter implements Callable<String> {

    int[] array;

    public BubbleSorter(int[] array) {
        this.array = array;
    }

    public void sort() {
        int temp;
        boolean sorted = false;
        int k = 0;
        while (!sorted) {
            sorted = true;
            k++;
            for (int i = 0; i < array.length - k; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    sorted = false;
                }
            }
        }
    }

    @Override
    public String call() throws Exception {
        if(array == null){
            throw new Exception("Cannot sort null object");
        }
        this.sort();
        return "Bubble sort";
    }
}
