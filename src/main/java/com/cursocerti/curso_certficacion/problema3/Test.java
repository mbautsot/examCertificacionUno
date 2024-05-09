package com.cursocerti.curso_certficacion.problema3;

import java.io.Console;
import java.util.Optional;

public class Test {

    public static void main(String[] args) {
        Optional<Console> optional = Optional.ofNullable(System.console());
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
    }
}
