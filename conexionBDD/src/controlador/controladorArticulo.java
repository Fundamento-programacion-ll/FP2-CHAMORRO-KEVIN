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
    ResultSet rs = null;
    articulo arti=new articulo();
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
    
   public void BuscarDatosPorIdNombre (String tipoBusqueda, String valorABuscar) throws SQLException{ //

        if (tipoBusqueda.equalsIgnoreCase("ID")) {

           int IdArticulo = Integer.parseInt(valorABuscar);

           String sqlSelectID = "select * from articulos where idArticulo LIKE "+"'%"+IdArticulo+"%'"+"";            

                ps = conexion.getConxion().prepareStatement(sqlSelectID);

                //ps.setInt(1, IdArticulo);

                rs  = ps.executeQuery();

                while (rs.next()) {                    

                    System.out.println("nombre: "+rs.getString(2));

                    System.out.println("descripcion: "+rs.getString(3));

                    System.out.println("precio: "+rs.getFloat(4));

                }                      

        }

        

        if (tipoBusqueda.equalsIgnoreCase("nombre")) {

            // SELECT * FROM Customers

            //WHERE CustomerName LIKE '%mar';

            String sqlSelectID = "select * from articulos where nombre LIKE "+"'%"+valorABuscar+"%'"+"";

            System.out.println(sqlSelectID);

                ps = conexion.getConxion().prepareStatement(sqlSelectID);

                //ps.setString(1, valorABuscar);

                rs  = ps.executeQuery();

                while (rs.next()) {                    

                    System.out.println("nombre: "+rs.getString(2));

                    System.out.println("descripcion: "+rs.getString(3));

                    System.out.println("precio: "+rs.getFloat(4));

                }

        }

        if (tipoBusqueda.equalsIgnoreCase("ninguno")) {

            String sqlSelectID ="select * from articulos";            

                ps = conexion.getConxion().prepareStatement(sqlSelectID);                

                rs  = ps.executeQuery();

                while (rs.next()) {                    

                    System.out.println("nombre: "+rs.getString(2));

                    System.out.println("descripcion: "+rs.getString(3));

                    System.out.println("precio: "+rs.getFloat(4));

                }

        }

    }
    public void ActualizarCliente(articulo arti) {

        

        String sqlact = "UPDATE articulos SET nombre=?, descripcion=?, precio=? WHERE idArticulo = ?";

        PreparedStatement ps =null;

        

            try {

                ps = conexion.getConxion().prepareStatement(sqlact);


                ps.setString(2, arti.getNombre());

                ps.setString(3, arti.getDescr());

                ps.setFloat(4, arti.getPrecio());

                ps.executeUpdate();

                

                JOptionPane.showMessageDialog(null, "Datos Actualizados");

            } catch (SQLException ex) {

                System.out.println("ERROR"+ ex);

                  JOptionPane.showMessageDialog(null, "ERROR");

            }

    }
    public ArrayList obtenerDatos() throws SQLException{
        ArrayList <String> listaNombres = new ArrayList<>();
        String selectDatos = "select nombre from articulos";
        ps= conexion.getConxion().clientPrepareStatement(selectDatos);
        rs= ps.executeQuery();
        while (rs.next()) {            
            listaNombres.add(rs.getString(1));
        }
        return listaNombres;
    }
    public void cargarCuadros(String nombre) throws SQLException{
        String selectCob="select * from articulos where nombre= "+"'"+nombre+"'"+"";
        ps=conexion.getConxion().clientPrepareStatement(selectCob);
        rs=ps.executeQuery();
        arti.setNombre(nombre);
        arti.setDescr(rs.getString("descripcion"));
        arti.setPrecio(rs.getFloat("precio"));
    }
}
