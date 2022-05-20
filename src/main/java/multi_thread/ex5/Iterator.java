package multi_thread.ex5;

import lombok.NonNull;

import java.util.concurrent.atomic.AtomicInteger;

public class Iterator<T> {
    private final AtomicInteger currentIndex = new AtomicInteger(0);
    private final T[] array;

    public Iterator(@NonNull T[] array) {
        this.array = array;
    }

    public T next(){
        if(currentIndex.get() < array.length - 1){
            return array[currentIndex.incrementAndGet()];
        }else{
            throw new IllegalArgumentException("Out of range!");
        }
    }

    public T prev(){
        if(currentIndex.get() > 0){
            return array[currentIndex.decrementAndGet()];
        }else{
            throw new IllegalArgumentException("Out of range!");
        }
    }
}
