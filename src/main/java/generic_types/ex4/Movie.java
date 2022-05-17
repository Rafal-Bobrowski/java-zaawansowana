package generic_types.ex4;

class Movie extends Multimedia{

    private String directior;
    private int yearOfRelease;
    private Genre genre;

    public Movie(String name, String directior, int yearOfRelease, Genre genre) {
        super(name);
        this.directior = directior;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
    }

    public String getDirectior() {
        return directior;
    }

    public void setDirectior(String directior) {
        this.directior = directior;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name= " + super.getName() +
                "directior='" + directior + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", genre=" + genre +
                '}';
    }
}
