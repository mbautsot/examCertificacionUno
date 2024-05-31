package com.cursocerti.curso_certficacion.problema69;

public class Test {
    public static void main(String[] args) {
        try { //outer
            try { //inner
                System.out.println(1/0);
            } catch(ArithmeticException e) {
                System.out.println("Inner");
            } finally {
                System.out.println("Finally 1");
            }
        } catch(ArithmeticException e) {
            System.out.println("Outer");
        } finally {
            System.out.println("Finally 2");
        }
    }
}
