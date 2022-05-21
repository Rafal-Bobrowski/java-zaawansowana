package java_io.ex6;

import java.io.IOException;

public class MovieRepositoryDemo {
    public static void main(String[] args) throws IOException {
        MovieRepository movieRepository = new MovieRepository();
        movieRepository.add(new Movie("5tar Wars Force Awaken", "Action", "J.J Ambrams", 2015));
        movieRepository.add(new Movie("5tar Wars Last Jedi","Action", "J.J Ambrams", 2017));
        System.out.println("Results :" + movieRepository.getAll());
    }
}
