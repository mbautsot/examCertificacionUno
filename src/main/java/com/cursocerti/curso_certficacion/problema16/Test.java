package com.cursocerti.curso_certficacion.problema16;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<String> c = new Callable<String>() {

            @Override
            public String call() throws Exception {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                }
                return "HELLO";
            }
        };

        ExecutorService es = Executors.newFixedThreadPool(10);
        List<Callable<String>> list = Arrays.asList(c,c,c,c,c);
         List<Future<String>> futures = es.invokeAll(list);
        System.out.println(futures.size());
        es.shutdown();
    }
}
