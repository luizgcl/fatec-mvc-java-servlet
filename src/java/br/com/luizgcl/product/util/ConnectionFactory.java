/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.luizgcl.product.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author luizleme
 */
public class ConnectionFactory {
    
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/alunos";
    
    public static Connection getConnection() 
            throws SQLException, Exception {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(DB_URL, "postgres", "root");
        } catch (ClassNotFoundException | SQLException ex) {
            throw new Exception(ex.getMessage());
        }
    }
    
    public static void closeConnection(Connection conn)
        throws Exception {
        close(conn, null, null); 
    }

    public static void closeConnection(Connection conn, Statement stmt)
        throws Exception {
        close(conn, stmt, null); 
    }

    public static void closeConnection(Connection conn, Statement stmt, ResultSet rs)
        throws Exception {
        close(conn, stmt, rs); 
    }
    
    private static void close(
            Connection conn, 
            Statement stmt, 
            ResultSet rs) throws Exception {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }
    }

}
