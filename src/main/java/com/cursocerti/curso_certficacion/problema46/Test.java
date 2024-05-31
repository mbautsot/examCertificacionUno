package com.cursocerti.curso_certficacion.problema46;

import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        
        int res = 1;
        IntStream stream = IntStream.range(1, 6);

         System.out.println(stream.reduce(res,(i,j)->i*j));//24

        //System.out.println(stream.reduce(0,(i,j)->i*j));/// 0
        
        //System.out.println(stream.reduce(1, (i,j)->i*j));//24

    }

}
