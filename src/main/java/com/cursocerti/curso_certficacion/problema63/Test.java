package com.cursocerti.curso_certficacion.problema63;

public class Test {
    public static void main(String[] args) {
        
        Shape shape = new Shape(ShapeType.CIRCLE) {

            @Override
            void draw() {
                System.out.println(getType());
            }
            
        };
        shape.draw();
    }
}
