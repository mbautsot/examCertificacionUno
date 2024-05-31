package com.cursocerti.curso_certficacion.problema43;

import java.util.Arrays;
import java.util.function.Predicate;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        ///CON CORRECCION PARA QUE CTR SE INCREMENTE.
       /*
        List<Integer> list = Arrays.asList(-80, 100, -40, 25, 200);
        int[] ctr = {1};
        Predicate<Integer> predicate = num ->{
            boolean result = num > 0;
            System.out.println(ctr[0]++ +".");
            return result;
        };
        
        list.stream().filter(predicate).findFirst();
         */

        
        List<Integer> list = Arrays.asList(-80, 100, -40, 25, 200);
        Predicate<Integer> predicate = num ->{
            boolean result = num > 0;
            int ctr = 1;
            System.out.println(ctr++ +".");
            return result;
        };
        
        list.stream().filter(predicate).findFirst();
    }

}
