package com.cursocerti.curso_certficacion.problema58;

public class A {

    public void someMethod(final String name) {
     //TODO ERROR Cannot instantiate the type BJava(16777373)
     //abstract class B {
     // TODO ERROR  public class B{  Illegal modifier for the local class B; only abstract or final is permitted
     
        final class B{ //CORRECTO O SIN MODIFICADOR SERA SOLO : class
        void print() {
                System.out.println("Hello " + name);
            }
        }
        new B().print();
        
    }
}

//TODO  Las clases locales (definidas dentro de un método) no pueden tener los modificadores public, private o protected. 
//TODO Solo pueden ser abstract o final, o no tener un modificador