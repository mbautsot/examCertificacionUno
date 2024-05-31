package com.cursocerti.curso_certficacion.problema71;

import java.util.function.Supplier;

public class Test {

        public static void main(String[] args) {
            check(Document::new);
            check(RFP::new);
        }
        // 1 CORRECTO 
        private static void check(Supplier<Document> supplier) {
            supplier.get().printAuthor();
        }
        //
        /* 2 correcto
        private static void check(Supplier<? extends Document> supplier) {
            supplier.get().printAuthor();
        }
        */
}

