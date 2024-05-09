package com.cursocerti.curso_certficacion.problema19;

import java.io.File;

public class Test {

    public static void main(String[] args) {
        File dir = new File("F:" + File.separator + "A" + File.separator + "B"); //"F:/A/B"
        System.out.println(dir.getParentFile().getParent());
    }
}
