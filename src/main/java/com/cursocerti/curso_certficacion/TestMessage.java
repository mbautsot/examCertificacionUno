package com.cursocerti.curso_certficacion;

import java.sql.*;

public class TestMessage {
    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:mysql://localhost:3306/curso";
        String user = "root";
        String password = "MBaut25?86";
        String query = "Select msg1 as msg, msg2 as msg FROM MESSAGES";

        try (
        Connection con = DriverManager.getConnection(url, user, password);
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery(query);)
        {
                rs.absolute(1);
                System.out.println(rs.getString("msg"));
                System.out.println(rs.getString("msg"));
        }
    }

}
