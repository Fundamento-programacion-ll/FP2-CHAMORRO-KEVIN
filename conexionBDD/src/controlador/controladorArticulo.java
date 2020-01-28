
package controlador;

import conexion.conector;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.articulo;

public class controladorArticulo {
    PreparedStatement ps= null;
    conector conexion= new conector();
    public void ingresarArticulo(articulo nuevoArticulo){
        String sqlInsert="insert articulo into (nombre,descripcion,precio) values(?,?,?)";
        try {
            ps=conexion.getConxion().prepareStatement(sqlInsert);
            ps.setString(1, nuevoArticulo.getNombre());
            ps.setString(2, nuevoArticulo.getDescripcion());
            ps.setFloat(3, nuevoArticulo.getPrecio());
            JOptionPane.showMessageDialog(null,"Datos ingresados correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al ingresar datos");
        }
    }
}
