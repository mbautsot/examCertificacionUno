package com.cursocerti.curso_certficacion.problema49;

public class Player {
    String name;
    int age;


     Player(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return name + "," + age;
    }

    /* 
    public Class getClass() { 
        return super.getClass();
    } 
    */  
}
