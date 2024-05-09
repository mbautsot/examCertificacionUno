package com.cursocerti.curso_certficacion.problema33;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
 
public class Test {
    public static void main(String[] args) throws IOException {
        Stream<Path> files = Files.list(Paths.get(System.getProperty("user.home")));
        files.forEach(System.out::println);
    }
}
