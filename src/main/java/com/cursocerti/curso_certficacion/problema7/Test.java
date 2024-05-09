package com.cursocerti.curso_certficacion.problema7;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {

    public static void main(String[] args) throws IOException{
        Properties prop = new Properties();
    
        FileInputStream fis = new FileInputStream ("/Users/mbautista/Documents/JAVA_CERTIFICACION/curso_certficacion/src/main/java/com/cursocerti/curso_certficacion/problema7/Message.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("key1"));
        System.out.println(prop.getProperty("key2", "Good Day!"));
        System.out.println(prop.getProperty("key3", "Good Day!"));
        System.out.println(prop.getProperty("key4"));
    
        /*
         Good Morning!
        Good Evening!
        Good Day!
        null 
         */
    }

}
