package com.cursocerti.curso_certficacion.problema17;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Counter());
        Thread t2 = new Thread(new Counter());
        Thread t3 = new Thread(new Counter());
        

        Thread[] threads = {t1, t2, t3};
        for(Thread thread : threads) {
            thread.start();
        }
    }
}