package com.cursocerti.curso_certficacion.problema22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Optional;

public class Test {
       public static void main(String[] args) throws IOException, ClassNotFoundException {
        Optional<LocalDate> optional = Optional.of(LocalDate.of(2018, 12, 1));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(("/Users/mbautista/Documents/date.ser")));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/mbautista/Documents/date.ser")))
        {
            oos.writeObject(optional);
 
            Optional<?> object = (Optional<?>)ois.readObject();
            System.out.println(object.get());
        }
    }
}
