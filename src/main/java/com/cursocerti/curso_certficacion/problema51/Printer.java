package com.cursocerti.curso_certficacion.problema51;

import java.util.concurrent.Callable;

class Printer implements Callable<String>{

    @Override
    public String call() throws Exception {
        System.out.println("DONE");
        return null;
    }

}
