package com.cursocerti.curso_certficacion.problema1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Player extends Thread{

    CyclicBarrier cb;

    public Player(){
        super();
    }

    public Player(CyclicBarrier cb){
        this.cb = cb;
        this.start();
    }

    public void run() {
        try {
            cb.await();
        } catch (BrokenBarrierException | InterruptedException e) {}
    }
}


