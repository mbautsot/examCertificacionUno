package com.cursocerti.curso_certficacion.problema41;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {

    @SuppressWarnings("removal")
    public static void main(String[] args) {
        
        Deque<Boolean> deque = new ArrayDeque<>();
        deque.push(new Boolean("abc"));
        deque.push(new Boolean("tRuE"));
        deque.push(new Boolean("FALSE"));
        deque.push(true);

    System.out.println(deque);
         //TODOS Se llama al método pop() en deque, que elimina y devuelve el primer elemento de la cola. 
        //TODO En este caso, se elimina el último elemento agregado.
       
      
        //TODO Se llama al método peek() en deque, que devuelve el primer elemento de la cola pero no lo elimina.
        //TODO En este caso, devuelve la próxima instancia de Boolean en la cola.
       

        //TODO Se llama al método size() en deque, que devuelve el número de elementos en la cola. En este caso, devuelve 3
        //TODO ya que se han agregado tres elementos a la cola antes de llamar a pop()
        System.out.println(deque.pop() + ":" + deque.peek() + ":" + deque.size());
    }

}
