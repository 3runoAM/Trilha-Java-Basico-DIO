package findInList.bookCatalogExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookCatalog {
    private static List<Book> books = new ArrayList<Book>();

    public static void addBook(Book book) {
        books.add(book);
    }

    public static List<Book> findByAuthor(String author) {
        return books.stream()
                .filter(b -> b.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public static List<Book> findBetweenDates(int startDate, int endDate) {
        return books.stream()
                .filter(b -> b.getPublishDate() >= startDate)
                .filter(b -> b.getPublishDate() <= endDate)
                .collect(Collectors.toList());
    }

    public static Optional<Book> findByTitle(String title) {
        return books.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .findFirst();
    }
}