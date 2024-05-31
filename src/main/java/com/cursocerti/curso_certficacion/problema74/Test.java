package com.cursocerti.curso_certficacion.problema74;

import java.sql.SQLException;

public class Test {
     private static void m() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            throw e;
        }
    }
 
    public static void main(String[] args) {
        try {
            m();
        } catch(SQLException e) {
            System.out.println("Caught Successfully.");
        }
    }
}
