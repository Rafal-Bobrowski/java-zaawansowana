package collections;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        SDAArrayList<Integer> arrayList = new SDAArrayList<>();
        for (int i = 0; i < 15; i++) {
            arrayList.add(i);
        }
        arrayList.display();
        System.out.println(arrayList.remove(4));
        System.out.println(arrayList.get(4));
        arrayList.display();

        try {
            arrayList.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

class SDAArrayList<T> {
    private int size = 0;
    private Object[] array;

    public SDAArrayList() {
        int INITIAL_ARRAY_LENGTH = 5;
        array = new Object[INITIAL_ARRAY_LENGTH];
    }

    public void add(T t) {
        if (size == array.length) {
            increaseSize();
        }
        array[size++] = t;
    }

    @SuppressWarnings("unchecked")
    public T remove(int index) {
        validateIndex(index);
        Object removedElement = array[index];
        if (size - index >= 0) System.arraycopy(array, index + 1, array, index, size - index);
        size--;
        decreaseSize();
        return (T) removedElement;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        validateIndex(index);
        return (T) array[index];
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("There is no element with index: " + index);
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void increaseSize() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    private void decreaseSize() {
        array = Arrays.copyOfRange(array, 0, size);
    }
}