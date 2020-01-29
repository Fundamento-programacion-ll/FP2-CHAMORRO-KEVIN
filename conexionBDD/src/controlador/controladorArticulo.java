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
}
