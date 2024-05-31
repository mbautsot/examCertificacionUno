package com.cursocerti.curso_certficacion.problema37;

import java.util.HashMap;
import java.util.Map;


public class Test {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "ONE");
        map.put(2,"TWO");
        map.put(3, "THREE");

        System.out.println(map.size()); //forma natural
        System.out.println(map.entrySet().stream().count()); //corrccion utilizando el metodo stream.

    }
}
