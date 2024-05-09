package com.cursocerti.curso_certficacion.problema34;

import java.util.Arrays;
import java.util.Locale;

;
public class Test {
    public static void main(String[] args) {
        
        Locale[] loc = Locale.getAvailableLocales();
       
        //Arrays.stream(loc).filter(x->x.toString().startsWith("fr")).forEach(System.out::println);
        ///si imprime fr_
        
        //Arrays.stream(loc).filter(x-> x.toString().contains("FR"))
        //.forEach(System.out::println);
        //Si imprime rf_  (48)

      

        //Arrays.stream(loc).filter(x->x.startsWith("fr"))
        // .forEach(System.out::println);
        ///ERROR EN TIMPO DE COMPILACION 

         Arrays.stream(loc).filter(x->x.getLanguage().equals("fr"))
           .forEach(System.out::println);
        ///si imprime registros 25 REGITROS


       // Arrays.stream(loc).filter(x->x.getLanguage().contains("FR"))
       // .forEach(System.out::println);
        //  NO IMPRIME NADA
    }
}
