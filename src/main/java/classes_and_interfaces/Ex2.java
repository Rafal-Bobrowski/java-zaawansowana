package classes_and_interfaces;

public class Ex2 {
    public static void main(String[] args) {
        Movie movie = new Movie.MovieCreator()
                .setDirector("J.J Abrams")
                .setGenre("Action")
                .setPublisher("Disney")
                .setYearOfRelease(2015)
                .setTitle("Star Wars")
                .createMovie();
        System.out.println(movie);
    }
}

class Movie {
    private String title;
    private String director;
    private String genre;
    private String publisher;
    private int yearOfRelease;

    public Movie(String title, String director, String genre, String publisher, int yearOfRelease) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.publisher = publisher;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    static class MovieCreator{
        private String title;
        private String director;
        private String genre;
        private String publisher;
        private int yearOfRelease;

        public Movie createMovie(){
            return new Movie(title,director,genre, publisher, yearOfRelease);
        }

        public MovieCreator setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieCreator setDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieCreator setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public MovieCreator setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public MovieCreator setYearOfRelease(int yearOfRelease) {
            this.yearOfRelease = yearOfRelease;
            return this;
        }
    }
}
