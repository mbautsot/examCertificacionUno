package com.cursocerti.curso_certficacion.problema55;

class Resource1 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Resource1");
    }
   /* 
    public  void closed(){
        System.out.println("Resource1");
    }
    */
}
