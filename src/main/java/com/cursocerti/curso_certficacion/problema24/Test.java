package com.cursocerti.curso_certficacion.problema24;

import java.util.OptionalDouble;

class Test  extends RuntimeException{
       public static void main(String[] args) {
        OptionalDouble optional = OptionalDouble.empty();
        System.out.println(optional.orElseThrow(Test::new));
    }
}
