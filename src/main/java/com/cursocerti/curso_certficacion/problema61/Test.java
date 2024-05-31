package com.cursocerti.curso_certficacion.problema61;

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
        String query = "DELETE FROM MESSAGES";
    
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
            ) {
            System.out.println(stmt.execute(query)); ///FALSE (NO REGRESA EL NUERO DE REGISTROS QUE BORRO)
           //TODO CORRECCCION
           //int row = stmt.executeUpdate(query);
           /* TODO
            sql an SQL Data Manipulation Language (DML) statement, 
            such as INSERT, UPDATE or DELETE; or an SQL statement that returns nothing, 
            such as a DDL statement.
           */
           //System.out.println("row--->" + row);
        } 
    }
}

/*TODO
    El problema principal que veo en tu código es que estás utilizando el método 
    executeQuery para ejecutar una consulta de eliminación (DELETE). 
    
    El método executeQuery se utiliza para ejecutar consultas de selección (SELECT), 
    no para consultas de modificación como DELETE, UPDATE o INSERT.
*/