package com.cursocerti.curso_certficacion.problema65;

class Printer {
    private static int count = 0;
    private Printer() {
        count++;
    }
 
    static Printer getInstance() {
        return PrinterCreator.printer;
    }
 
    static class PrinterCreator {
        static Printer printer = new Printer();
    }
 
    static int getCount() {
        return count;
    }
}