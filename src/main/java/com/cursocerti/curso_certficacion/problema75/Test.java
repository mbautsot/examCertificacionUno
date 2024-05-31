package com.cursocerti.curso_certficacion.problema75;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<? super String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        for(Object str : list) {///correccion
        //for(String str : list) {

            System.out.print(str);
        }
    }
}
