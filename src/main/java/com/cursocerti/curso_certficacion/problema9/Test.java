package com.cursocerti.curso_certficacion.problema9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:mysql://localhost:3306/curso";
        String user = "root";
        String password = "MBaut25?86";
        String query = "Select ID, FIRSTNAME, LASTNAME, SALARY FROM EMPLOYEE ORDER BY ID";
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ) {
            ResultSet rs = stmt.executeQuery(query);
            rs.relative(-3);
            rs.relative(1);
            System.out.println(rs.getInt(1));
        }
    }

}
