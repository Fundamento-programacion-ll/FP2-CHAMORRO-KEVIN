package controlador;

import conexion.Conector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jugador;

public class ControladorJugador {
        Conector conexion = new Conector();
        PreparedStatement ps = null;
        ResultSet rsconsult = null;
        
    public void ingresarEquipo(Jugador ju){
        long fecha = ju.getFechaIngreso().getTime();
        java.sql.Date fechaIngreso = new java.sql.Date(fecha);
        String sqlIngresar="INSERT INTO jugador (IDJUGADOR, IDEQUIPO, NOMBREJUGADOR, NUMEROCAMISETA, NOMBRECAMISETA, FECHAINGRESO, GOLES) "
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            ps=conexion.getConexion().prepareStatement(sqlIngresar);
            ps.setInt(1, ju.getIdJugador());
            ps.setInt(2,ju.getIdEquipo());
            ps.setString(3, ju.getNombreJugador());
            ps.setInt(4,ju.getNumeroCamiseta());
            ps.setString(5, ju.getNombreCamiseta());
            ps.setDate(6, fechaIngreso);
            ps.setInt(7, ju.getGoles());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorEquipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexion.Desconectarse();
    }
}
