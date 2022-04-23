package exceptions;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args){
        BookRepository bookRepository = new BookRepository();
        Book book1 = new Book("abc", "W pustyni i w puszczy", "Henryk Sienkiewicz", 1895);
        Book book2 = new Book("bcd", "Java przewodnik dla poczatkujacych", "Herbert Schildt", 2019);
        Book book3 = new Book("cde", "Gdzie jest moj passat", "Jan Kowalski", 2000);
        Book book4 = new Book("def", "Jak zyc z sasiadem", "Jan Nowak", 2015);
        Book book5 = new Book("efg", "Od bogacza do janusza", "Janusz Januszewski", 2015);

        bookRepository.addBook(book1);
        bookRepository.addBook(book2);
        bookRepository.addBook(book3);
        bookRepository.addBook(book4);
        bookRepository.addBook(book5);

        try {
            System.out.println(bookRepository.findBookIsbn("abc"));
            System.out.println(bookRepository.findBookIsbn("fgh"));

        } catch (NoBookFindException e) {
            System.out.println(e);
        }

        try {
            System.out.println(bookRepository.findBookTitle("Jak zyc z sasiadem"));
            System.out.println(bookRepository.findBookTitle("Od bogacza do Janusza"));
            bookRepository.deleteBook("efg");
            System.out.println(bookRepository.findBookTitle("Od bogacza do Janusza"));
        } catch (NoBookFindException e) {
            System.out.println(e);
        }
    }
}

class NoBookFindException extends Exception {
    public NoBookFindException(String msg) {
        super(msg);
    }
}

class BookRepository {

    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(Book book) {
        books.remove(book);
    }

    public void deleteBook(String isbn) throws NoBookFindException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                return;
            }
        }
        throw new NoBookFindException("Can't delete book with isbn: " + isbn);
    }

    public Book findBookTitle(String title) throws NoBookFindException {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        throw new NoBookFindException("There is no book with title: " + title);
    }

    public Book findBookIsbn(String isbn) throws NoBookFindException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new NoBookFindException("There is no book with isbn: " + isbn);
    }
}


class Book {
    private String isbn;
    private String title;
    private String author;
    private int year;

    public Book(String isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
