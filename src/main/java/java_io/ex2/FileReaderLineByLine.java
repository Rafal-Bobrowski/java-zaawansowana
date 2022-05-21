package java_io.ex2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderLineByLine {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/java/java_io/ex2/text.txt");
        for(String line : Files.readAllLines(path)){
            System.out.println(line);
        }
    }
}
