package com.cursocerti.curso_certficacion.problema53;

public class Test {
    int i = 100;
    
    I5 obj1 = new I5() {
        int i = 200;
        public void print() {
            System.out.println(this.i);
        }
    };
    
    I5 obj2 = () -> {
        int i = 300;
        System.out.println(this.i);
    };

    //TODO En el contexto de una expresión lambda en Java, 
    //TODO cuando escribes int i = 300;, no estás creando una nueva variable de instancia para la clase que contiene la expresión lambda. En cambio, estás declarando una variable local dentro del cuerpo de la expresión lambda. 

    public static void main(String[] args) {
        Test ques = new Test();
        ques.obj1.print(); //200
        ques.obj2.print(); //100
    }
}
