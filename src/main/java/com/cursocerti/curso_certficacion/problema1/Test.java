package com.cursocerti.curso_certficacion.problema1;

import java.util.concurrent.CyclicBarrier;

public class Test {
    public static void main(String[] args) {
        Match match = new Match();
        CyclicBarrier cb = new CyclicBarrier(2, match);
       
       Player p1 = new Player(cb);
        /*INSERT*/
        System.out.println("****" +p1);

        new Player(cb); //CORRECTA
        //p1.start();
        //cb.await();
        // new Player(cb).start(); /// si imprime Match is starting , sin embargo entra en error (Exception in thread "main" java.lang.IllegalThreadStateException)
        //new Player(); 
    }
}
