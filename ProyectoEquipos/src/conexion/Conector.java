
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conector {
    
    Connection conexion = null;
    String url = "jdbc:mysql://localhost:3306/bdd_equipos?useSSL=false";
    String usuario = "admin";
    String password = "12345678";
    
    
    public Conector(){
        
        try {
            conexion = (Connection) DriverManager.getConnection(url,usuario,password);
            if (conexion != null) {
                System.out.println("Se conecto");
            } else {
                System.err.println("No Se conecto");
            }
        } catch (SQLException ex) {
            System.err.println("Error conexion");
            ex.printStackTrace();
        }
    }
    
    
    public  Connection getConexion(){
        return conexion;
    }
    
    public  void Desconectarse(){
        conexion = null;
    }
    
}
