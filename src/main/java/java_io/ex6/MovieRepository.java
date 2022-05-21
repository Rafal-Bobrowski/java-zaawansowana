package java_io.ex6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private final MovieParser movieParser = new MovieParser();
    private final Path PATH = Paths.get("src/main/java/java_io/ex6/movies.txt");


    public void add(Movie movie) throws IOException {
        Files.write(PATH, movieParser.toCSV(movie).getBytes(), StandardOpenOption.APPEND);
    }

    public List<Movie> getAll() throws IOException {
        List<Movie> movies = new ArrayList<>();
        for(String csvLine : Files.readAllLines(PATH)){
            movies.add(movieParser.fromCSV(csvLine));
        }
        return movies;
    }
}
