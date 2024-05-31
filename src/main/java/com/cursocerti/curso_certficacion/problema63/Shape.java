package com.cursocerti.curso_certficacion.problema63;

 
abstract class Shape {
    private ShapeType type = ShapeType.SQUARE; //default ShapeType
 
    Shape(ShapeType type) {
        this.type = type;
    }
 
    public ShapeType getType() {
        return type;
    }
 
    abstract void draw();
}
