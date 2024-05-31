package com.cursocerti.curso_certficacion.problema47;

 class Student {
    private String name;
    private int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int hashCode() {
        return name.hashCode() + age;

    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student stud = (Student)obj;
            return this.name.equals(stud.name) && this.age == stud.age;
        }
        return false;
    }

    public String getName() {return name;}
 
    public int getAge() {return age;}
 
    public static int compareByName(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
    //TODO
    //////////////////CNSTRUCTOR EL CUAL PUEDE SOLUCIONAR EL DETALLE QUE GUARDE TODOS LOS STUDENTS 
    //COMPRANDOLO POR EDAD Y NOMBRE

    public static int compareByNameThenAge(Student s1, Student s2) {
        int nameComparison = s1.getName().compareTo(s2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        // Si los nombres son iguales, compara por edad
        return Integer.compare(s1.getAge(), s2.getAge());
    }

}
