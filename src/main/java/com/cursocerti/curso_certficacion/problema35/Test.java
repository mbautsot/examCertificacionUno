package com.cursocerti.curso_certficacion.problema35;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book ("Head First Java", "Kathy Sierra", 24.5),
                new Book ("OCP", "Udayan Khattry", 20.99),
                new Book ("OCA", "Udayan Khattry", 14.99));
        books.stream().collect(Collectors.groupingBy(Book::getAuthor))
                .forEach((a,b) -> System.out.println(a));
    }
}
