package com.cursocerti.curso_certficacion.problema21;

class Point {

    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
    
    boolean filter() {
        return this.x == this.y;
    }
}
