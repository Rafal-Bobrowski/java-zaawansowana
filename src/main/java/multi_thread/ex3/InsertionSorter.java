package multi_thread.ex3;

import lombok.NonNull;

import java.util.concurrent.Callable;

public class InsertionSorter implements Callable<String> {
    int[] array;

    public InsertionSorter(@NonNull int[] array) {
        this.array = array;
    }

    public void sort(){
        for(int i = 1; i<array.length; i++){
            int current = array[i];
            int j = i - 1;
            while(j>=0 && current < array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

    @Override
    public String call() throws Exception {
        if(array == null){
            throw new Exception("Cannot sort null object");
        }
        this.sort();
        return "Insertion sort";
    }
}
