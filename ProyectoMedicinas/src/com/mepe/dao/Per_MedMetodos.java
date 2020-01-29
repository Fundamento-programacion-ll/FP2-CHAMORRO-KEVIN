package com.mepe.dao;

import com.mepe.modelo.Per_Med;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Per_MedMetodos implements IPer_Med {
    //variable para la conexion con la base
    private Connection conn;
    //metodo para asignaar la conexion a la base
    public Per_MedMetodos() {
        if (conn == null) {
            conn = ConexionJDBC.getConnection();
        }
    }
    //metodo para cerrar la conexion con la base
    private void closeConnection() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(" Error al cerrar la conexion " + ex.getMessage());
        }
    }

    @Override
    public void InsertarPer_Med(Per_Med perMed) {
        String sqlPerMed = "INSERT INTO per_med (codigo,id_persona) "
                + "VALUES(?,?)";
        PreparedStatement psPerMed = null;
        try {
            psPerMed = conn.prepareStatement(sqlPerMed);
            psPerMed.setString(1, perMed.getCodigo_med());
            psPerMed.setInt(2, perMed.getId_per());
            psPerMed.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                psPerMed.close();
                closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
}
