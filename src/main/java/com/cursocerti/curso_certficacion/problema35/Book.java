package com.cursocerti.curso_certficacion.problema35;

public class Book {
    String title;
    String author;
    double price;
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String toString() {
        return "{" + title + "," + author + "," + price + "}";
    }
}
