package com.cursocerti.curso_certficacion.problema55;

public class Test {
    public static void main(String[] args) throws Exception {
        try(Resource1 r1 = new Resource1(); 
        Resource2 r2 = new Resource2()) {
            System.out.println("Test");
        }
    }
}

//TODO SI SE CORRIGE IMPRIME 
/*
Test
Resource2
Resource1
*/