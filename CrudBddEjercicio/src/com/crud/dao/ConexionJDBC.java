package com.crud.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionJDBC {
    public static Connection conn;
    
    private static final String USER = "userPrueba";
    private static final String PASSWORD = "clavePrueba";
    private static final String URL = "jdbc:mysql://localhost:3306/bdd_clientes?allowPublicKeyRetrieval=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String CLASS_DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() {
        try {
            Class.forName(CLASS_DRIVER).newInstance();
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
        } catch (Exception ex) {
            System.out.println(ConexionJDBC.class.getName() + " Error al abrir la conexion");
            ex.printStackTrace();
        }
        return conn;
    }    
}
