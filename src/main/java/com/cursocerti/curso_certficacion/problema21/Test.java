package com.cursocerti.curso_certficacion.problema21;

import java.util.ArrayList;
import java.util.List;


public class Test {
       public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(0, 0));
        list.add(new Point(1, 2));
        list.add(new Point(-1, -1));
        
        list.stream().filter(Point::filter).forEach(System.out::println);; //Line n1
    }

}
