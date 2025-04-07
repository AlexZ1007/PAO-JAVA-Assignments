package Lab4.Bookstore;


import java.util.Objects;

public class Book {
    String title;
    String author;
    String publisher;
    int pageCount;

    public Book() {}

    public Book(String title, String author, int pageCount, String publisher) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.publisher = publisher;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "BOOK_TITLE: " + title.toUpperCase() + "\n "
                + "BOOK_AUTHOR: " + author + "\n "
                + "BOOK_PUBLISHER: " + publisher.toLowerCase() + "";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageCount == book.pageCount && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher);
    }



}
