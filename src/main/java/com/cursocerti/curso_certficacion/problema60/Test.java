package com.cursocerti.curso_certficacion.problema60;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.stream().anyMatch(s->s.length() > 0)); //FALSE
        System.out.println(list.stream().allMatch(s-> s.length()> 0));  //TRUE
        System.out.println(list.stream().noneMatch(s ->s.length()>0));  //TRUE
    }
}
