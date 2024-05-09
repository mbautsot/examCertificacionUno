package com.cursocerti.curso_certficacion.problema18;

public class Test {
    public static void main(String[] args) {
        try {
            throw new YourException();
        } catch(MyException e1){
            System.out.println("Caught");
        }
    }
}
