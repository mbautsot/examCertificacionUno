package com.cursocerti.curso_certficacion.problema11;

class MyResource implements AutoCloseable{

    @Override
    public void close() {
        System.out.println("Closing");
    }
}
