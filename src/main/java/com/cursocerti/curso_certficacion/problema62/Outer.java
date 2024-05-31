package com.cursocerti.curso_certficacion.problema62;

public class Outer {

    abstract static class Animal { //Line 2
        abstract void eat();
    }
    
    static class Dog extends Animal { //Line 6
        void eat() { //Line 7
            System.out.println("Dog eats biscuits"); ///
        }
    }

}
