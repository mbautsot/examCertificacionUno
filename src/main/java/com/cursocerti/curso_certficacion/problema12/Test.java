package com.cursocerti.curso_certficacion.problema12;

import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) throws Exception{
        Map<Integer,String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "tree");
        map.put(null, "null");

        map.forEach((key, value) -> System.out.println("{" + key + ": " + value + "}"));
              
    }
}
