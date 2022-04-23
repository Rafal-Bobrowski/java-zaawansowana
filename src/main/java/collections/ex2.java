package collections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

enum Sex {
    MALE, FEMALE
}

enum Genre {
    ACTION, FANTASY, CRIME, PROGRAMMING
}

public class ex2 {
    public static void main(String[] args) {
        Author author1 = new Author("Herbert", "Schildt", Sex.MALE);
        Author author2 = new Author("John", "Smith", Sex.MALE);
        Author author3 = new Author("Jessica", "Albana", Sex.FEMALE);
        Author author4 = new Author("Roger", "Moore", Sex.MALE);
        Author author5 = new Author("Catherin", "Nadie", Sex.FEMALE);

        Book book1 = new Book("Book 1", 3400, 2000, List.of(author2), Genre.FANTASY);
        Book book2 = new Book("Book 2", 5600, 1999, Arrays.asList(author3, author4, author5), Genre.ACTION);
        Book book3 = new Book("Java Przewodnik dla poczatkujacych", 5900, 2018,
                List.of(author1), Genre.PROGRAMMING);

        BookService bookService = new BookService();
        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);

        System.out.println(bookService.findByAuthor(author2));
        System.out.println(bookService.getBooks());
        System.out.println(bookService.findMostExpensiveBook());
        System.out.println(bookService.findCheapestBook());
        System.out.println(bookService.sortByTitleDsc());
        System.out.println(bookService.sortByTitleAsc());
    }
}

@Getter
@Setter
@AllArgsConstructor
class Author {
    private String name;
    private String lastName;
    private Sex sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName) && sex == author.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, sex);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

@Getter
@Setter
@AllArgsConstructor
class Book implements Comparable<Book> {
    private String title;
    private int priceCents;
    private int yearOfRelease;
    private List<Author> authors;
    private Genre genre;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return (Objects.equals(title, book.title)
                && priceCents == book.priceCents
                && yearOfRelease == book.yearOfRelease
                && Objects.equals(authors, book.authors)
                && genre == book.genre);
    }

    public int hashCode() {
        return Objects.hash(title, priceCents, yearOfRelease, authors, genre);
    }

    @Override
    public int compareTo(Book book) {
        return this.getTitle().compareTo(book.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", priceCents=" + priceCents +
                ", yearOfRelease=" + yearOfRelease +
                ", authors=" + authors +
                ", genre=" + genre +
                '}';
    }
}

@Getter
@Setter
@NoArgsConstructor
class BookService {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> findByGenre(Genre genre) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre() == genre) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> findByAuthor(Author author) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> findByYear(int yearStart, int yearEnd) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getYearOfRelease() >= yearStart && book.getYearOfRelease() <= yearEnd) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> findByNumberOfAuthors(int numberOfAuthors) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().size() == numberOfAuthors) {
                results.add(book);
            }
        }
        return results;
    }

    public Book findCheapestBook() {
        if (isBookServiceEmpty()) return null;
        Book result = books.get(0);
        for (Book book : books) {
            if (book.getPriceCents() < result.getPriceCents()) {
                result = book;
            }
        }
        return result;
    }

    public Book findMostExpensiveBook() {
        if (isBookServiceEmpty()) return null;
        Book result = books.get(0);
        for (Book book : books) {
            if (book.getPriceCents() > result.getPriceCents()) {
                result = book;
            }
        }
        return result;
    }

    private boolean isBookServiceEmpty() {
        return books.size() == 0;
    }

    public boolean isBookInService(Book book) {
        return books.contains(book);
    }

    public List<Book> sortByTitleAsc() {
        Collections.sort(books);
        return books;
    }

    public List<Book> sortByTitleDsc() {
        books.sort((book1, book2) -> book2.getTitle().compareTo(book1.getTitle()));
        return books;
    }

}