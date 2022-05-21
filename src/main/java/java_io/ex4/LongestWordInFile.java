package java_io.ex4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class LongestWordInFile {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/java/java_io/ex4/text.txt");
        int maxLength = Files.readAllLines(path).stream()
                .flatMap((str)-> Arrays.stream(str.split(" ")))
                .max(Comparator.comparingInt(String::length))
                .orElse("")
                .length();
        System.out.println(maxLength);
    }
}
