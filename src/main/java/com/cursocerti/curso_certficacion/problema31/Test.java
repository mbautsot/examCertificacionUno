package com.cursocerti.curso_certficacion.problema31;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

 public static void main(String[] args) {
        Path path = Paths.get("/Users/mbautista/Desktop/F/A/B/C/Book.java");
        System.out.println(path.subpath(1,4));
    }
}
