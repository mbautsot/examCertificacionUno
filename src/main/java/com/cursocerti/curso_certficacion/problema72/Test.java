package com.cursocerti.curso_certficacion.problema72;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("fr", "CA"));
        Locale loc = new Locale("en", "IN");

        ResourceBundle rb = ResourceBundle.getBundle("ResourceBundle", loc);
        System.out.println(rb.getString("locale"));
    }
}