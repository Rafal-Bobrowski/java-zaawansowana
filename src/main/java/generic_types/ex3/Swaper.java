package generic_types.ex3;

public class Swaper {
    public static <T> void swap (T[] array, int index1, int index2){
        T temporaryElement = array[index1];
        array[index1] = array[index2];
        array[index2] = temporaryElement;
    }
}
