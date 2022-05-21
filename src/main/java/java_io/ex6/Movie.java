package java_io.ex6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
public class Movie {

    private String title;
    private String genre;
    private String director;
    private int releaseYear;

}
