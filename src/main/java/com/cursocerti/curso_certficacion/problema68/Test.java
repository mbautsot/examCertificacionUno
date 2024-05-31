package com.cursocerti.curso_certficacion.problema68;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {
        public static void main(String[] args) throws IOException{
            
            //TODO/PRIMERA OPCION ---CORRECTA LEE DE MANERA CORRECTA EL ARCHIVO
            Files.lines(Paths.get("/Users/mbautista/Desktop/F/Book.java")).forEach(System.out::println);
       
            //TODO/SEGUNDA OPCION ---->  CORRECTA DE GUAL FORMA LEE ARCHIVO 
            Files.readAllLines(Paths.get("/Users/mbautista/Desktop/F/Book.java")).forEach(System.out::println);
       
            //TODO/ TERCERA OPCION --> CORRECTA LEE ARCHIVO 
            Files.readAllLines(Paths.get("/Users/mbautista/Desktop/F/Book.java")).stream().forEach(System.out::println);
       
         //   Files.lines(Paths.get("/Users/mbautista/Desktop/F/Book.java")).stream().forEach(System.out::println);
       
            ///TODO Eliminación de la cuarta opción: La cuarta opción era redundante y su uso de stream() era innecesario porque Files.lines ya devuelve un Stream<String>.


        }
}
