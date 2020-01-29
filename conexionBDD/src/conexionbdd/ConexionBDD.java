/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbdd;

import com.mysql.jdbc.PreparedStatement;
import conexion.conector;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antho
 */
public class ConexionBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PreparedStatement ps = null;
        conector stringConexion = new conector();
        stringConexion.getConxion();
        
    }
    
}
