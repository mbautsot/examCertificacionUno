package com.cursocerti.curso_certficacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestEmployee {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso", "root", "MBaut25?86");
            String query = "Select * FROM EMPLOYEE";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) { //Line 12
                System.out.println("ID: " + rs.getInt("ID"));
                System.out.println("First Name: " + rs.getString("FIRSTNAME"));
                System.out.println("Last Name: " + rs.getString("LASTNAME"));
                System.out.println("Salary: " + rs.getDouble("SALARY"));
            }
            rs.close(); //Line 18
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}

