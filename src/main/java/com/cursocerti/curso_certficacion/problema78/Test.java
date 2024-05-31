package com.cursocerti.curso_certficacion.problema78;

public class Test {
    private static void checkStatus() {
        assert 1 == 2 : 2 == 2;
    }
 
    public static void main(String[] args) {
        try {
            checkStatus();
        } catch (AssertionError ae) {
            System.out.println(ae.getCause());
        }
    }
}
