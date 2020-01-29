package com.mepe.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionJDBC {
    public static Connection conn;
    private static final String USER="Persona";
    private static final String PASSWORD="Medicina";
    private static final String URL = "jdbc:mysql://localhost:3306/"+"bdd_medicina"+"?allowPublicKeyRetrieval="
            + "true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacy"
            + "DatetimeCode=false&serverTimezone=UTC";
    private static final String CLASS_DRIVER="com.mysql.cj.jdbc.Driver";
    
    public static Connection getConnection(){
        try {
            Class.forName(CLASS_DRIVER).newInstance();
            conn =DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception ex) {
            System.out.println(ConexionJDBC.class.getName()+" Error al abrir la conexion");
            ex.printStackTrace();
        }
        return conn;
    }
}
