package com.cursocerti.curso_certficacion.problema25;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test {
      public static void main(String [] args) {
        LocalDateTime date = LocalDateTime.of(2019, 1, 1, 10, 10,45);
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(formatter.format(date));
    }
}
