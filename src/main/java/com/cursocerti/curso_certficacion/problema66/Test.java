package com.cursocerti.curso_certficacion.problema66;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Test {
  public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        BiConsumer<Integer, String> consumer = map::putIfAbsent;
        consumer.accept(1, null);
        consumer.accept(2, "two");
        consumer.accept(1, "ONE");
        consumer.accept(2, "TWO");
 
        System.out.println(map);
    }
}
