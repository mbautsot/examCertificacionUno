package com.cursocerti.curso_certficacion.problema14;

import java.util.function.BiPredicate;

public class Test {
    public static void main(String[] args) {
        BiPredicate<String, String> predicate = String::equalsIgnoreCase;
        System.out.println(predicate.test("JaVa", "java"));
    }
}
