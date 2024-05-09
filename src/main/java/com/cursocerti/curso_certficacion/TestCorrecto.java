package com.cursocerti.curso_certficacion;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestCorrecto {
    public static void main(String[] args) throws SQLException {
        
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso", "root", "MBaut25?86")) {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO EMPLOYEE VALUES(101, 'John', 'Smith', 12000)");
            stmt.close();
        } 
    }
}
