package com.cursocerti.curso_certficacion.problema64;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test {
    public static void main(String [] args) {
        LocalTime t1 = LocalTime.now();
        LocalDateTime t2 = LocalDateTime.now();
        System.out.println(Duration.between(t2, t1)); ///java.time.DateTimeException
    }
}

//TODO  si se envia         System.out.println(Duration.between(t1, t2));
/*PT0.009507S indica una duración de tiempo. Aquí está el significado de cada parte:

PT: Esto indica que estamos tratando con una "Period of Time" (Período de Tiempo) en el estándar ISO 8601.
0.009507S: Aquí, 0.009507 representa el número de segundos en la duración. Significa que la diferencia entre t2 y t1 es de 0.009507 segundos.
En resumen, la salida PT0.009507S indica que la diferencia entre t2 y t1 es de aproximadamente 0.009507 segundos.
*/