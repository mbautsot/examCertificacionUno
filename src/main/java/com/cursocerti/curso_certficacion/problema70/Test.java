package com.cursocerti.curso_certficacion.problema70;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        
        List<Person> list = Arrays.asList(
         new Person("Tom", "Ridlee"),
         new Person("Tom", "Hanks"),
         new Person("Yusuf", "Pathan")
        );

        list.stream().sorted(Comparator.comparing(Person::getFirstName).reversed()
        .thenComparing(Person::getLastName)).forEach(System.out::println);        
    }
}
