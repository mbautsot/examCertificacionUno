package com.cursocerti.curso_certficacion.problema38;

import java.util.concurrent.Callable;

//class MyThread implements Runnable{
    class MyThread implements Callable{


    private String str;

    MyThread(String str) {
        this.str = str;
    }

  /*   @Override
    public void run() {
        System.out.println(str.toUpperCase());
    }
    */

    @Override
    public Object call() throws Exception {
        System.out.println(str.toUpperCase());
        return null;

    }

}
