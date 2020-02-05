package controlador;

import conexion.Conector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Equipo;

public class ControladorEquipo {
    Conector conexion = new Conector();
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public ArrayList obtenerDatos() throws SQLException{
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
}
