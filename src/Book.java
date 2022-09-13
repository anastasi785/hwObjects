import java.util.Objects;

public class Book {
    private String title;
    private int publisherData;
    private Author author;

    public Book(String title, int publisherData, Author author) {
        this.title = title;
        this.publisherData = publisherData;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublisherData() {
        return publisherData;
    }

    public void setPublisherData(int publisherData) {
        this.publisherData = publisherData;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Книга " +
               title +
                ", Дата публикации " + publisherData +
                ", Автор " + author;
    }
}


