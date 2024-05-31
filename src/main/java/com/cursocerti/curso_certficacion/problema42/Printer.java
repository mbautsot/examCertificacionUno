package com.cursocerti.curso_certficacion.problema42;

@SuppressWarnings("hiding")
class Printer<T> {
    private T t;
    Printer(T t){
        this.t = t;
    }
    @Override
    public String toString(){
        return t.toString();
    }
}
