package controlador;

import conexion.Conector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jugador;

public class ControladorJugador {
    Conector conexion = new Conector();
    PreparedStatement ps = null;
    ResultSet rs = null;
        
    public ArrayList obtenerDatos() throws SQLException{
        ArrayList<Jugador> listaJugadores= new ArrayList<>();        
        String selectDatos = "select * from equipo";
        ps = conexion.getConexion().prepareStatement(selectDatos);
        rs = ps.executeQuery();        
        while (rs.next()) {            
            Jugador ju = new Jugador();
            ju.setIdJugador(rs.getInt(1));
            ju.setIdEquipo(rs.getInt(2));
            ju.setNombreJugador(rs.getString(3));
            ju.setNumeroCamiseta(rs.getInt(4));
            ju.setNombreCamiseta(rs.getString(5));
            ju.setFechaIngreso(rs.getDate(6));
            ju.setGoles(rs.getInt(7));
            listaJugadores.add(ju);
        }
        return listaJugadores;
    }
        
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
    
    public Jugador BuscarJugadorId(int id) {
        Jugador ju = null;
        String sql = "SELECT * FROM jugador  WHERE idJugador = ?";
        ps = null;
        rs = null;
        try {
            ps = conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                ju.setIdEquipo(id);
                ju.setIdEquipo(rs.getInt(2));
                ju.setNombreJugador(rs.getString(3));
                ju.setNombreCamiseta(rs.getString(4));
                ju.setNumeroCamiseta(rs.getInt(5));
                ju.setFechaIngreso(rs.getDate(6));
                ju.setGoles(rs.getInt(7));
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorJugador.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.Desconectarse();
        }
        return ju;
    }
}
