package com.cursocerti.curso_certficacion.problema73;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class Test {
    public static void main(String[] args) {
        
        Locale loc = new Locale("en", "US"); //en-US --> en_US 
        ResourceBundle bundle = ResourceBundle.getBundle("RB", loc);
        Enumeration<String> enumeration = bundle.getKeys();
        while (enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();
            String val = bundle.getString(key);
            System.out.println(key + "=" + val);
        }
    }
}
