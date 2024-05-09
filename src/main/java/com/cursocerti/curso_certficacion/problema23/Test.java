package com.cursocerti.curso_certficacion.problema23;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Test {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        LocalDateTime obj = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(obj);
    }

}
