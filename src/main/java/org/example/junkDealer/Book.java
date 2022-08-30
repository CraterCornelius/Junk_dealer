package org.example.junkDealer;

public class Book extends Product {

    protected String title;
    protected String author;

    public Book(int id, String name, int value, String title, String author) {
        super(id, name, value);
        this.author = author;
        this.title = title;
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
}
