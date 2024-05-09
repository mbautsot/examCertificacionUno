package com.cursocerti.curso_certficacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestPng {

    public static void main(String[] args) throws IOException {
      
        try (FileInputStream fis = new FileInputStream("/Users/mbautista/Desktop/orig.png");
             FileOutputStream fos = new FileOutputStream("/Users/mbautista/Desktop/copy.png")) {
            @SuppressWarnings("unused")
            int res;
            byte [] arr = new byte[500000]; //Line 10
            while((res = fis.read(arr)) != -1){ //Line 11
                
                fos.write(arr); //Line 12

            }
        }
    }
}
