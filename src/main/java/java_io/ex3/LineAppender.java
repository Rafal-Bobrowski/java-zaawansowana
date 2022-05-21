package java_io.ex3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class LineAppender {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/java/java_io/ex3/text.txt");
        File file = path.toFile();
        Files.write(path, "new line\n".getBytes(), StandardOpenOption.APPEND);
    }
}
