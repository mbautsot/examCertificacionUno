package com.cursocerti.curso_certficacion.problema30;

import java.util.function.Consumer;

public class Test {
        public static void main(String[] args) {
            Consumer<Integer> consumer = System.out::print;
            Integer i = 5;
            consumer.andThen(consumer).accept(i++); //Line 7
        }
    ////IMPRIME 55
}
