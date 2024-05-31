package com.cursocerti.curso_certficacion.problema59;

import java.util.Arrays;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1st", "2nd", "3rd", "4th");
       System.out.println( list.stream().filter(s -> s.endsWith("d"))
        .reduce((s1 ,s2) -> s1+s2));

    }   
}

//TODO RESULTADO : Optional[2nd3rd]