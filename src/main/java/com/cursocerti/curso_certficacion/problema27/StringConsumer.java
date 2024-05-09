package com.cursocerti.curso_certficacion.problema27;

import io.reactivex.functions.Consumer;

interface StringConsumer extends Consumer<String> {
    @Override
    public default void accept(String s) {
        System.out.println(s.toUpperCase());
    }
}
