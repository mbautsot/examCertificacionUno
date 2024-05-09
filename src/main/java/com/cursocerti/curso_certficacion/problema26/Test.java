package com.cursocerti.curso_certficacion.problema26;

import java.util.function.ToIntFunction;

public class Test {
    public static void main(String[] args) {
           String text = "Aa aA aB Ba aC Ca";
        ToIntFunction<String> func = text::indexOf;
        System.out.println(func.applyAsInt("z"));
    }

}
