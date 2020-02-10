package controlador;

import conexion.Conector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Equipo;
import modelo.Usuario;

public class ControladorEquipo {
    Conector conexion = new Conector();
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public ArrayList ObtenerDatosEquipo() throws SQLException{
        ArrayList<Equipo> listaEquipos= new ArrayList<>();        
        String selectDatos = "select * from equipo";
        ps = conexion.getConexion().prepareStatement(selectDatos);
        rs = ps.executeQuery();        
        while (rs.next()) {            
            Equipo eq = new Equipo();
            eq.setIdEquipo(rs.getInt(1));
            eq.setNombreEquipo(rs.getString(2));
            eq.setLiga(rs.getString(3));
            eq.setFechaCreacion(rs.getDate(4));
            eq.setNumeroInter(rs.getInt(5));
            eq.setCampeonActual(rs.getBoolean(6));
            listaEquipos.add(eq);
        }
        return listaEquipos;
    }
    
    public void IngresarEquipo(Equipo eq){
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
    
    public Equipo BuscarEquipoId(int id) {
        Equipo eq = null;
        String sql = "SELECT * FROM equipo  WHERE id_equipo = ?";
        ps = null;
        rs = null;
        try {
            ps = conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                eq.setIdEquipo(id);
                eq.setNombreEquipo(rs.getString(2));
                eq.setLiga(rs.getString(3));
                eq.setNumeroInter(rs.getInt(4));
                eq.setFechaCreacion(rs.getDate(5));
                eq.setCampeonActual(rs.getBoolean(6));
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorEquipo.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.Desconectarse();
        }
        return eq;
    }
        public Equipo BuscarEquipoNombre(String nombre) {
        Equipo eq = null;
        String sql = "SELECT * FROM equipo  WHERE nombreEquipo like ?";
        ps = null;
        rs = null;
        try {
            ps = conexion.getConexion().prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                eq.setIdEquipo(rs.getInt(1));
                eq.setNombreEquipo(rs.getString(2));
                eq.setLiga(rs.getString(3));
                eq.setNumeroInter(rs.getInt(4));
                eq.setFechaCreacion(rs.getDate(5));
                eq.setCampeonActual(rs.getBoolean(6));
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorEquipo.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.Desconectarse();
        }
        return eq;
    }
        public Equipo BuscarEquipoLiga(String liga) {
        Equipo eq = null;
        String sql = "SELECT * FROM equipo  WHERE liga like ?";
        ps = null;
        rs = null;
        try {
            ps = conexion.getConexion().prepareStatement(sql);
            ps.setString(1, liga);
            rs = ps.executeQuery();
            while (rs.next()) {
                eq.setIdEquipo(rs.getInt(1));
                eq.setNombreEquipo(rs.getString(2));
                eq.setLiga(rs.getString(3));
                eq.setNumeroInter(rs.getInt(4));
                eq.setFechaCreacion(rs.getDate(5));
                eq.setCampeonActual(rs.getBoolean(6));
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorEquipo.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.Desconectarse();
        }
        return eq;
    }
        public Equipo BuscarEquipoInternacionales(int inter) {
        Equipo eq = null;
        String sql = "SELECT * FROM equipo  WHERE numeroInter like ?";
        ps = null;
        rs = null;
        try {
            ps = conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, inter);
            rs = ps.executeQuery();
            while (rs.next()) {
                eq.setIdEquipo(rs.getInt(1));
                eq.setNombreEquipo(rs.getString(2));
                eq.setLiga(rs.getString(3));
                eq.setNumeroInter(rs.getInt(4));
                eq.setFechaCreacion(rs.getDate(5));
                eq.setCampeonActual(rs.getBoolean(6));
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorEquipo.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.Desconectarse();
        }
        return eq;
    }
        public void ActualizarEquipo(Equipo  equipo) {
        long fecha = equipo.getFechaCreacion().getTime();
        java.sql.Date fechaCrea = new java.sql.Date(fecha);
        //codigo sql para actualizar datos de una tabla
        String sqlActualizarEq= "UPDATE equipo SET nombreEquipo=?, liga=?, fechaCreacion=?, numeroInter=?, campeonActual=?"
                + " WHERE idEquipo=?";
        try {
            ps= conexion.getConexion().prepareStatement(sqlActualizarEq);
            ps.setString(1, equipo.getNombreEquipo());
            ps.setString(2, equipo.getLiga());
            ps.setDate(3, fechaCrea);
            ps.setInt(4, equipo.getNumeroInter() );
            ps.setBoolean(5,equipo.isCampeonActual());
            ps.setInt(6,equipo.getIdEquipo());
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
        String sqlEiminar= "DELETE FROM equipo WHERE idEquipo= ?";
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

    public Usuario AutenticarUsuario(String text, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
