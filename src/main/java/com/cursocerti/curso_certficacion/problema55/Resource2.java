package com.cursocerti.curso_certficacion.problema55;

class Resource2 implements AutoCloseable{
    /* 
    public  void closed(){
        System.out.println("Resource2");
    }
    */

    
    public void close() throws Exception {
        System.out.println("Resource2");
    }
}
