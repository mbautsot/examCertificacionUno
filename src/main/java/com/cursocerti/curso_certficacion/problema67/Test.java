package com.cursocerti.curso_certficacion.problema67;
 
class Printer<String> {

    private String t;
    Printer(String t){
        this.t = t;
    }
}
 

public class Test {
    public static void main(String[] args) {
        Printer<Integer> obj = new Printer<>(100);
        System.out.println("--->" + obj);
    }

}
