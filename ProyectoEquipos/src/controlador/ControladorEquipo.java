package controlador;

import conexion.Conector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Equipo;

public class ControladorEquipo {
    Conector conexion = new Conector();
    PreparedStatement ps = null;
    ResultSet rsconsult = null;
    
    
    public void ingresarEquipo(Equipo eq){
        long fecha = eq.getFechaCreacion().getTime();
        java.sql.Date fechaCreacion = new java.sql.Date(fecha);
        String sqlIngresar="INSERT INTO equipo (idEquipo,nombreEquipo,liga,fechaCreacion,numeroInter,campeonActual) "
                + "VALUES(?,?,?,?,?,?)";
        try {
            ps=conexion.getConexion().prepareStatement(sqlIngresar);
            ps.setInt(1, eq.getIdEquipo());
            ps.setString(2, eq.getNombreEquipo());
            ps.setString(3, eq.getLiga());
            ps.setDate(4, fechaCreacion);
            ps.setInt(5, eq.getNumeroInter());
            ps.setBoolean(6, eq.isCampeonActual());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorEquipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexion.Desconectarse();
    }
}
