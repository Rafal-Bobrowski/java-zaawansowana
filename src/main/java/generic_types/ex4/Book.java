package generic_types.ex4;


import java.util.List;

class Book extends Multimedia{

    private List<Author> authors;
    private Genre genre;

    public Book(String name, List<Author> authors, Genre genre) {
        super(name);
        this.authors = authors;
        this.genre = genre;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name= " + super.getName() +
                "authors=" + authors +
                ", genre=" + genre +
                '}';
    }
}
