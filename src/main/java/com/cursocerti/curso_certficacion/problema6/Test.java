package com.cursocerti.curso_certficacion.problema6;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        
        String[] cities = {"Seoul","Tokio","Paris","London","Hong Kong","Singapore"};

        Arrays.stream(cities).sorted((s1,s2) -> s2.compareTo(s1)) //REaliza un ordenamiento de forma descendente
        .forEach(System.out::println);
/*
        Tokio
        Singapore
        Seoul
        Paris
        London
        Hong Kong
 */
        System.out.println("**********************");

        Arrays.stream(cities).sorted((s1,s2) -> s1.compareTo(s2))///Ordenamiento Ascendente
        .forEach(System.out::println);

        /* 
        Hong Kong
        London
        Paris
        Seoul
        Singapore
        Tokio
         */

    }

}
