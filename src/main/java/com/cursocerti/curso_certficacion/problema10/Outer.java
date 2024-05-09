package com.cursocerti.curso_certficacion.problema10;

public class Outer {
    private String name = "James Gosling";

    
    ////RESPUESTA CORRECTA
    class Inner{
        public void printName() {
            System.out.println(name);
        }
    }
    
    ////por ser abstract NO SE PUEDE INSTANCIAR DESDE TEST
    /* 
    abstract class Inner{
        public void printName(){
            System.out.println(name);   
        }    
    }
    */

    ////Es incorrecto y que inner no cumple con las reglas no es una palabra reservada.
    /* 
    inner class Inner{
        public void printName(){
            System.out.println(name);   
        }  
    }
    */

    /*
    class Inner{
        public void printName(){
            /// NO S POSIBL ACCESAR A ESTA VARIABL YA QUE ES UNA VARIABLE DE UNA CLASE EXTERNA QUE ES OUTER
            System.out.println(this.name);   
        }  
    }
     */
}
