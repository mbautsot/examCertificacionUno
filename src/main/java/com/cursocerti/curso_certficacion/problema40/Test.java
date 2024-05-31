package com.cursocerti.curso_certficacion.problema40;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/mbautista/Documents/temp.dat");
        
        try (

        DataOutputStream os = new DataOutputStream(new FileOutputStream(file));
        DataInputStream is = new DataInputStream(new FileInputStream(file));
        
        ) {
            os.writeChars("JAVA");
            System.out.println(is.readChar());  
        } 
    }

}
