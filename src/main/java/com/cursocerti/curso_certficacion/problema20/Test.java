package com.cursocerti.curso_certficacion.problema20;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(25, "Pune");
        map.put(32, "Mumbai");
        map.put(11, "Sri Nagar");
        map.put(39, "Chennai");
 
        System.out.println(map.headMap(25, true));
    }
}