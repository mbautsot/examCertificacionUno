package com.cursocerti.curso_certficacion.problema32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
     public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/curso";
        String user = "root";
        String password = "MBaut25?86";
        String query = "Select ID, FIRSTNAME, LASTNAME, SALARY FROM EMPLOYEE WHERE SALARY > 14900 ORDER BY ID";
 
        try (
            Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(query);
        ) {
           rs.absolute(2);
           rs.updateDouble("SALARY", 20000);

           /// Este codigo se adiciono  SIN ELLOS NO SE ACTUALIZARA EL REGISTRO EN LA BD
           rs.updateRow(); ///actualizar el registro.
           con.commit();
           ////7
           
        } catch (SQLException ex) {
            System.out.println("Error");
        }
    }
}
