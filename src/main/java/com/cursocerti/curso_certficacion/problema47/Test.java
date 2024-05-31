package com.cursocerti.curso_certficacion.problema47;

import java.util.Set;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
       // Set<Student> students = new TreeSet<>(Student::compareByName); //TODO solo compara por nombre
       Set<Student> students = new TreeSet<>(Student::compareByNameThenAge);//TODO campara por NOMBRE Y EDAD
        students.add(new Student("James", 20));
        students.add(new Student("James", 20));
        students.add(new Student("James", 22));
 
        System.out.println(students.size());
    }

}
