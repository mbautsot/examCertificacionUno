package com.cursocerti.curso_certficacion.problema15;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        
        String[] arr= {"A5","B4","C3","D2","E1"};
        Arrays.sort(arr,Comparator.comparing(s -> s.substring(1)));
        for (String str : arr) {
            System.out.println(str+"");
        }
    }

}
