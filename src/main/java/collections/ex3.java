package collections;
import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i =0; i<100; i++){
            list.add(random.nextInt(50));
        }
        Set<Integer> uniqueValues = new HashSet<>();
        Set<Integer> duplicateValues = new HashSet<>();

        for (Integer i : list){
            if(!uniqueValues.add(i)){
                duplicateValues.add(i);
            }
        }
        uniqueValues.removeAll(duplicateValues);
        System.out.println(list);
        System.out.println(uniqueValues);
        System.out.println(duplicateValues);
    }
}
