package List.PesquisaEmLists.bookCatalogExample;

public class Book {
    private final String title;
    private final String author;
    private final int publishDate;

    public Book(String title, String author, int publishDate) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishDate() {
        return publishDate;
    }
}