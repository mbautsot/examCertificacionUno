package com.cursocerti.curso_certficacion.problema54;


/* incorrecto
    interface Operation<T> {
    T operate(T x , T y);
}
*/

/**
 * Operation
 */

//TODO  CORRECTO
interface Operation {
    int operate (int x , int y);
    
}

//TODO  CORRECTO
/*
interface Operation {
    long operate (long x , long y);
    
}
 */

 /*
  interface Operation<T extends Integer> {
    T operate(T x , T y);
}
 */
