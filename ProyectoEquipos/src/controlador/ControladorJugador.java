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
    public ArrayList ObtenerDatosJugador() throws SQLException{
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
        
    public void IngresarJugador(Jugador ju){
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
        }finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorJugador.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.Desconectarse();
        }   
    }
    
    public Jugador BuscarJugadorId(int id) {
        Jugador ju = null;
        String sql = "SELECT * FROM jugador  WHERE idJugador = ?";
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
    public Jugador BuscarJugadorIdEquipo(int id) {
        Jugador ju = null;
        String sql = "SELECT * FROM jugador WHERE idEquipo like ?";
        ps = null;
        rs = null;
        try {
            ps = conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                ju.setIdEquipo(rs.getInt(1));
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
    public Jugador BuscarJugadorNombre(String nombre) {
        Jugador ju = null;
        String sql = "SELECT * FROM jugador WHERE NombreJugador like ?";
        ps = null;
        rs = null;
        try {
            ps = conexion.getConexion().prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                ju.setIdEquipo(rs.getInt(1));
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
    public Jugador BuscarJugadorGoles(int goles) {
        Jugador ju = null;
        String sql = "SELECT * FROM jugador WHERE NumeroGoles like ?";
        ps = null;
        rs = null;
        try {
            ps = conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, goles);
            rs = ps.executeQuery();
            while (rs.next()) {
                ju.setIdEquipo(rs.getInt(1));
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
    public void ActualizarJugador(Jugador jugador) {
        long fecha = jugador.getFechaIngreso().getTime();
        java.sql.Date fechaIns = new java.sql.Date(fecha);
        //codigo sql para actualizar datos de una tabla
        String sqlPersona = "UPDATE jugador SET IdEquipo=?, nombreJugador=?, numeroCamiseta=?, nombreCamiseta=?, fechaIngreso=?, goles=?"
                + " WHERE idJugador=?";
        try {
            ps= conexion.getConexion().prepareStatement(sqlPersona);
            ps.setInt(1,jugador.getIdEquipo());
            ps.setString(2, jugador.getNombreJugador());
            ps.setInt(3, jugador.getNumeroCamiseta());
            ps.setString(4, jugador.getNombreCamiseta());
            ps.setDate(5,fechaIns);
            ps.setInt(6, jugador.getGoles());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorJugador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorJugador.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.Desconectarse();
        }
    }
    public void EliminarJugador(int id) {
        String sqlEiminar= "DELETE FROM jugador WHERE idJugador= ?";
        try {
            ps= conexion.getConexion().prepareStatement(sqlEiminar);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorJugador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorJugador.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.Desconectarse();
        }
    }
}
