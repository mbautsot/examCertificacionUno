package com.cursocerti.curso_certficacion.problema4;

import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
        .parallel()
        .forEachOrdered(System.out::println);///lo imprime de forma ordenada 
        
        //SI SE ENVIAR parallel 
        ///junto con el .forEach (Esto lo imprimira de forma desordenada) 

        //Para ello se esta enviando : forEachOrdered
    }
}
