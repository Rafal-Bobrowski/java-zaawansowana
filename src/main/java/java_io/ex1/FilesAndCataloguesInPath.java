package java_io.ex1;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class FilesAndCataloguesInPath {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/");
        File file = path.toFile();
        for(String name : Objects.requireNonNull(file.list())){
            System.out.println(name);
        }
    }
}
