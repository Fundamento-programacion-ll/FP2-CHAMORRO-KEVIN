/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.conector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.articulo;

/**
 *
 * @author antho
 */
public class controladorArticulo {
    conector conexion = new conector();
    PreparedStatement ps = null;
    ResultSet rsconsult = null;
    
    public void ingresarArticulo(articulo nuevoArticulo){
        
        String sqlInsert = 
                "insert into articulos  (nombre,descripcion,precio) values (?,?,?)";
        try {
            ps = conexion.getConxion().prepareStatement(sqlInsert);
            ps.setString(1, nuevoArticulo.getNombre());
            ps.setString(2, nuevoArticulo.getDescr());
            ps.setFloat(3, nuevoArticulo.getPrecio());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
        } catch (SQLException ex) {
            System.out.println("ERROR"+ ex);
                  JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
    
    /**public void Cosultaarticulo (String consultaarticulo){
        
        String sqlconsult = 
                "Select * from articulos where nombre = ?";
        try {
            ps = conexion.getConxion().prepareStatement(sqlconsult);
            ps.setString(1, sqlconsult);
            rsconsult = ps.executeQuery();
            
            while(rsconsult.next()){
                
                String nombre= rsconsult.getString("nombre");
                String descripcion= rsconsult.getString("descripcion");
                float precio= rsconsult.getFloat("precio");
                System.out.println("El producto es: ");
            }
            JOptionPane.showMessageDialog(null, "Consulta realizada");
            
        } catch (SQLException ex) {
            System.out.println("ERROR"+ ex);
                  JOptionPane.showMessageDialog(null, "ERROR");
        }
    }**/
    
    public void Cosultaarticuloprecio (int consultaarticulo){
        String nombre ="";
        String sqlconsult = 
                "Select * from articulos where idArticulo = ?";
        try {
            ps = conexion.getConxion().prepareStatement(sqlconsult);
            ps.setInt(1, consultaarticulo);
            rsconsult = ps.executeQuery();
            
            while(rsconsult.next()){
                nombre= rsconsult.getString("nombre");
                String descripcion= rsconsult.getString("descripcion");
                float precio= rsconsult.getFloat("precio");
                if (rsconsult.next()==true){
                System.out.println("El producto es: "+ nombre +" "+ descripcion +" "+ precio);}
            }
            
            JOptionPane.showMessageDialog(null, "Consulta realizada");
            
        } catch (SQLException ex) {
            System.out.println("ERROR"+ ex);
                  JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
    public void Cosultaarticulonombre (String consultaarticulo){
        String nombre2 ="";
        String sqlconsult = 
                "Select * from articulos where nombre = ?";
        try {
            ps = conexion.getConxion().prepareStatement(sqlconsult);
            ps.setString(1, consultaarticulo);
            rsconsult = ps.executeQuery();
            
            while(rsconsult.next()){
                
                nombre2= rsconsult.getString("nombre");
                
                String descripcion= rsconsult.getString("descripcion");
                
                float precio= rsconsult.getFloat("precio");
                System.out.println("El producto es: "+ nombre2 + " "+ descripcion + " "+ precio);
                if (rsconsult.next()==true){
                System.out.println("El producto es: "+ nombre2 +" "+ descripcion +" "+ precio);}
            }
            
            JOptionPane.showMessageDialog(null, "Consulta realizada");
        } catch (SQLException ex) {
            System.out.println("ERROR"+ ex);
                  JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
    public void Cosultaarticulo (String nombre, String consultaarticulo){
        
        String sqlconsult = 
                "Select * from articulos where idArticulo = ?";
        try {
            ps = conexion.getConxion().prepareStatement(sqlconsult);
            ps.setString(1, consultaarticulo);
            rsconsult = ps.executeQuery();
            
            while(rsconsult.next()){
                nombre= rsconsult.getString("nombre");
                String descripcion= rsconsult.getString("descripcion");
                float precio= rsconsult.getFloat("precio");
                if (rsconsult.next()==true){
                System.out.println("El producto es: "+ nombre +" "+ descripcion +" "+ precio);}
            }
            
            JOptionPane.showMessageDialog(null, "Consulta realizada");
            
        } catch (SQLException ex) {
            System.out.println("ERROR"+ ex);
                  JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
    
    public articulo consultararticulo (int idarticulo){
        articulo art = null;
        String nombre ="";
        String sqlconsult = 
                "Select * from articulos where idArticulo = ?";
        try {
            ps = conexion.getConxion().prepareStatement(sqlconsult);
            ps.setInt(1, idarticulo);
            rsconsult = ps.executeQuery();
            
            while(rsconsult.next()){
                nombre= rsconsult.getString("nombre");
                String descripcion= rsconsult.getString("descripcion");
                float precio= rsconsult.getFloat("precio");
                if (rsconsult.next()==true){
                System.out.println("El producto es: "+ nombre +" "+ descripcion +" "+ precio);}
                art = new articulo(nombre, descripcion, precio);
            }
            
            JOptionPane.showMessageDialog(null, "Consulta realizada");
            
        } catch (SQLException ex) {
            System.out.println("ERROR"+ ex);
                  JOptionPane.showMessageDialog(null, "ERROR");
        }
        
    return art;
    }
    
    public articulo consultararticulonom (String nombr){
        articulo art = null;
        String nombre ="";
        String sqlconsult = 
                "Select * from articulos where nombre = ?";
        try {
            ps = conexion.getConxion().prepareStatement(sqlconsult);
            ps.setString(1, nombr);
            rsconsult = ps.executeQuery();
            
            while(rsconsult.next()){
                
                nombre= rsconsult.getString("nombre");
                String descripcion= rsconsult.getString("descripcion");
                float precio= rsconsult.getFloat("precio");
                System.out.println("El producto es: "+ nombre + " "+ descripcion + " "+ precio);
                if (rsconsult.next()==true){
                System.out.println("El producto es: "+ nombre +" "+ descripcion +" "+ precio);}
                art = new articulo(nombre, descripcion, precio);
            }
            
            JOptionPane.showMessageDialog(null, "Consulta realizada");
            
        } catch (SQLException ex) {
            System.out.println("ERROR"+ ex);
                  JOptionPane.showMessageDialog(null, "ERROR");
        }
        
    return art;
    }
    public void ActualizarCliente(articulo cli) {
        
        String sqlact = "UPDATE articulos SET nombre=?, descripcion=?, precio=? WHERE nombre = ?";
        PreparedStatement ps =null;
        
            try {
                ps = conexion.getConxion().prepareStatement(sqlact);
                ps.setString(1, cli.getNombre());
                ps.setString(2, cli.getDescr());
                ps.setFloat(3, cli.getPrecio());
                ps.setString(4, cli.getNombre());
                ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Datos Actualizados");
            } catch (SQLException ex) {
                System.out.println("ERROR"+ ex);
                  JOptionPane.showMessageDialog(null, "ERROR");
            }
    }
    
   public ArrayList obtenerDatos() throws SQLException{
        ArrayList<articulo> listaNombres = new ArrayList<>();        
        String selectDatos = "select * from articulos";
        ps = conexion.getConxion().prepareStatement(selectDatos);
        rsconsult = ps.executeQuery();        
        while (rsconsult.next()) {            
            articulo art = new articulo();
            art.setNombre(rsconsult.getString(2));
            art.setDescr(rsconsult.getString(3));
            art.setPrecio(rsconsult.getInt(4));
            listaNombres.add(art);
        }
        return listaNombres;
    }
    public void eliminarRegistro(){
        String delete="delete * from articulos where nombre= ?";
        try {
            ps=conexion.getConxion().clientPrepareStatement(delete);
            ps.setString(2, delete);
        } catch (SQLException ex) {
            Logger.getLogger(controladorArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
