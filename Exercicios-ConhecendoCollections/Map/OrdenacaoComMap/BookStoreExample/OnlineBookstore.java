package Set.OrdancaoComMap.BookStoreExample;

import javax.swing.plaf.PanelUI;
import java.util.*;
import java.util.stream.Collectors;

public class OnlineBookstore {
    private static Map<String, Book> availableBooks = new HashMap<>();

    public static Map<String, Book> getAvailableBooks() {
        return availableBooks;
    }

    public static void addBook(String amazonLink, Book book) {
        availableBooks.put(amazonLink, book);
    }

    public static void removeBook(String amazonLink) {
        availableBooks.remove(amazonLink);
    }

    public static void showBooksByPrice() {
        availableBooks.entrySet()
                .stream()
                .sorted(Comparator.comparing(entry -> entry.getValue().getPrice()))
                .forEach(System.out::println);
    }

    public static List<Book> getBooksByAuthor(String author) {
        return availableBooks.values()
                .stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public static Optional<Book> getMostExpensiveBook() {
        return availableBooks.values()
                .stream()
                .max(Comparator.comparing(Book::getPrice));
    }

    public static Optional<Book> getLessExpensiveBook() {
        return availableBooks.values()
                .stream()
                .min(Comparator.comparing(Book::getPrice));
    }
}
