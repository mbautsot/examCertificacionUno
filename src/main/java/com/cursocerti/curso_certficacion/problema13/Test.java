package com.cursocerti.curso_certficacion.problema13;
 
class Animal {}
 
class Dog extends Animal {}
 
class Cat extends Animal {}
 
class A<T> {
    T t;
    void set(T t) {
        this.t = t;
    }
 
    T get() {
        return t;
    }
}
 
public class Test {
    //public static <T> void print1(A<? extends Animal> obj) {
       // obj.set(new Dog()); //Line 22
      //  System.out.println(obj.get().getClass());
        /* 
        EN LA LINEA 22 : 
        La declaración A<? extends Animal> indica que obj es un objeto de tipo A 
        que puede almacenar cualquier subtipo de Animal. Sin embargo, el compilador 
        no puede garantizar el tipo específico de los elementos almacenados en obj, 
        por lo que no te permite agregar un objeto Dog 
        */

    //}
 /* 
    public static <T> void print2(A<? super Dog> obj) {
        obj.set(new Dog()); //Line 27
        System.out.println(obj.get().getClass());
    }
 
    public static void main(String[] args) {
        A<Dog> obj = new A<>();
       // print1(obj); //Line 33
        print2(obj); //Line 34
    }
    */

}
