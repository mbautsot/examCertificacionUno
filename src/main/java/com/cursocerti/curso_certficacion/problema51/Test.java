package com.cursocerti.curso_certficacion.problema51;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        es.submit(new Printer());
        System.out.println("HELLO");
        es.shutdown();
    }

}
