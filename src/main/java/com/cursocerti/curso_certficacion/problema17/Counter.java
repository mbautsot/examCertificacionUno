package com.cursocerti.curso_certficacion.problema17;

import java.util.concurrent.atomic.AtomicInteger;

class Counter implements Runnable {

    private static AtomicInteger ai = new AtomicInteger(3);

    @Override
    public void run() {
        System.out.print(ai.getAndDecrement());
    }

}
