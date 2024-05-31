package com.cursocerti.curso_certficacion.problma44;

public class M {

    private int num1=100;

    public class N {
        
        private int num2=200;
    }

    public static void main(String[] args) {
        
        M outer = new M();
        M.N inner = outer.new N();

        System.out.println(outer.num1+inner.num2);

    }

}
