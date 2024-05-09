package com.cursocerti.curso_certficacion.problema8;


public class Test {
    public static void convert(String s) throws IllegalArgumentException,RuntimeException,Exception {
        if(s.length()==0){
            throw new RuntimeException("Length should be greater than 0.");
        }
    }

    public static void main(String [] args) {
        try {
            convert("");
        }
       // catch(IllegalArgumentException | RuntimeException | Exception e) { //Line 14
       //     System.out.println(e.getMessage()); //Line 15
       // } //Line 16
       catch(RuntimeException e){
            System.out.println(e.getMessage());
       }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    //COMENTAR LAS linea 14,15,16 va a enviar un ERROR en la consola 
    //java.lang.RuntimeException: Length should be greater than 0.

    /*
    Por lo tanto la respuesta correcta es 
        catch(RuntimeException e){
            System.out.println(e.getMessage());
    }
    YA QUE CON ELLA SE IMPRIME EL CONSOLA : Length should be greater than 0.
    */

}
