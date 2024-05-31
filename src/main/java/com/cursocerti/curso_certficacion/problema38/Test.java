package com.cursocerti.curso_certficacion.problema38;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newSingleThreadExecutor();
        MyThread thread = new MyThread("ocp");
       // Future future = es.submit(thread);
      // Future<Integer> future = es.submit(thread);

    //TODO Correccion desde la clase MyThread debe de ser Callable
    @SuppressWarnings("unchecked")
    Future<Integer> future = es.submit(thread);
    
    Integer tmp = (Integer) future.get(); //Line 22
        System.out.println(tmp);
        es.shutdown();
    }
}

