package com.cursocerti.curso_certficacion.problema48;

import java.util.function.BiPredicate;

public class Test {

    public static void main(String[] args) {
        
        String[] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
        BiPredicate<String, String> predicate = String::startsWith;
        
        for (String str : arr) {
            if (predicate.negate().test(str, "A")) {
                System.out.println("-->"+ str);
            }
        }
    }

}
