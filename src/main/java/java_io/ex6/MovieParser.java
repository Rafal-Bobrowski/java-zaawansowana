package java_io.ex6;

public class MovieParser {

    public Movie fromCSV(String csvLine){
        String[] data = csvLine.split(",");
        return new Movie(data[0], data[1], data[2], Integer.parseInt(data[3]));
    }

    public String toCSV(Movie movie){
        return String.join(",", movie.getTitle(), movie.getGenre(), movie.getDirector(), String.valueOf(movie.getReleaseYear())) + "\n";
    }
}
