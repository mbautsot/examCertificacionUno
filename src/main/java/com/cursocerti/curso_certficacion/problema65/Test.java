package com.cursocerti.curso_certficacion.problema65;

public class Test {

    public static void main(String[] args) {
        Printer p1 = Printer.getInstance();
        Printer p2 = Printer.getInstance();
        Printer p3 = Printer.getInstance();
        System.out.println(Printer.getCount());
    }

    

}
