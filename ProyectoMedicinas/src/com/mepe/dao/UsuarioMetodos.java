package com.mepe.dao;

import com.mepe.modelo.Usuario;
import com.mepe.vista.DatosUsuarios;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioMetodos implements IUsuario{
    //variable para la conexion con la base
    private Connection conn;
    //metodo para asignaar la conexion a la base
    public UsuarioMetodos() {
        if (conn == null) {
            conn = ConexionJDBC.getConnection();
        }
    }
    //metodo para cerrar la conexion con la base
    private void closeConnection() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(" Error al cerrar la conexion " + ex.getMessage());
        }
    }

    @Override
    public List<Usuario> ListarUsuario() {
        List<Usuario> listaUsuario = new ArrayList<Usuario>();
        Usuario usuario = null;
        //codigo para mostrar todos los daaos de una tabla en sql
        String sqlUsuario = "SELECT * FROM perfil ";
        Statement stUsuario = null;
        ResultSet rsUsuario = null;
        try {
            stUsuario = conn.createStatement();
            rsUsuario = stUsuario.executeQuery(sqlUsuario);
            

            while (rsUsuario.next()) {
                int id= rsUsuario.getInt(1);
                String usu = rsUsuario.getString("usuario");
                String clave = rsUsuario.getString("clave");
                char per = rsUsuario.getString("permiso").charAt(0);
                String nombre = rsUsuario.getString("nombre");
                usuario = new Usuario(id, usu, clave, per, nombre);
                listaUsuario.add(usuario);
                System.out.println(usu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rsUsuario.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return listaUsuario;
    }

    @Override
    public void InsertarUsuario(Usuario usu) {
        //codigo para encriptar clave
        String sqlClave="SELECT SHA2('"+usu.getClave()+"', 256)";
        //Codigo para insertar dtos en una tabla en sql
        String sqlUsuario = "INSERT INTO perfil (usuario,clave,permiso,nombre) "
                + "VALUES(?,?,?,?)";
        PreparedStatement psUsuario = null;
        Statement stUsuario = null;
        ResultSet rsUsuario = null;
        try {
            stUsuario=conn.createStatement();
            rsUsuario=stUsuario.executeQuery(sqlClave);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioMetodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            psUsuario = conn.prepareStatement(sqlUsuario);
            psUsuario.setString(1, usu.getUsuario());
            while (rsUsuario.next()) {
                String usua =rsUsuario.getString(1);
                psUsuario.setString(2, usua);
            }
            psUsuario.setString(3, String.valueOf(usu.getPermiso()));
            psUsuario.setString(4, usu.getNombre());
            psUsuario.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rsUsuario.close();
                psUsuario.close();
                closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void ActualizarUsuario(Usuario usu) {
        //codigo sql para actualizar datos de una tabla
        String sqlClave="SELECT SHA2("+usu.getClave()+", 256)";
        //Codigo para actuaizar datos en una tabla en sql
        String sqlUsuario = "UPDATE perfil SET usuario=?, clave=?, permiso=?, nombre=?"
                +" WHERE idperfil=?";
        PreparedStatement psUsuario = null;
        Statement stUsuario = null;
        ResultSet rsUsuario = null;
        try {
            stUsuario=conn.createStatement();
            rsUsuario=stUsuario.executeQuery(sqlClave);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioMetodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            psUsuario = conn.prepareStatement(sqlUsuario);
            psUsuario.setString(1, usu.getUsuario());
            while (rsUsuario.next()) {
                String usua =rsUsuario.getString(1);
                psUsuario.setString(2, usua);
            }
            psUsuario.setString(3, String.valueOf(usu.getPermiso()));
            psUsuario.setString(4, usu.getNombre());
            psUsuario.setString(5, Integer.toString(DatosUsuarios.codigo));
            psUsuario.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rsUsuario.close();
                psUsuario.close();
                closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void EliminarUsuario(int id) {
        String sqlUsuario = "DELETE FROM perfil WHERE idperfil=?";
        PreparedStatement psCliente = null;

        try {
            psCliente = conn.prepareStatement(sqlUsuario);
            psCliente.setString(1, Integer.toString(id));
            psCliente.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                psCliente.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
    }

    @Override
    public Usuario BuscarUsuarioId(int id) {
        Usuario usuario = null;
        //codigo para selleccionar datos de una tabla con un criterio como filtro
        String sqlUsuario = "SELECT * FROM perfil u WHERE u.idperfil= ?";
        PreparedStatement psUsuario = null;
        ResultSet rsUsuario = null;

        try {
            psUsuario = conn.prepareStatement(sqlUsuario);
            psUsuario.setInt(1, id);
            rsUsuario = psUsuario.executeQuery();

            while (rsUsuario.next()) {
                String usu = rsUsuario.getString("usuario");
                String clave = rsUsuario.getString("clave");
                char per = rsUsuario.getString("permiso").charAt(0);
                String nombre = rsUsuario.getString("nombre");
                usuario = new Usuario(id, usu, clave, per, nombre);
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rsUsuario.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return usuario;    
    }

    @Override
    public Usuario BuscarUsuarioUsu(String usu) {
        Usuario usuario = null;
        //codigo para selleccionar datos de una tabla con un criterio como filtro
        String sqlUsuario = "SELECT * FROM perfil WHERE usuario like ?";
        PreparedStatement psUsuario = null;
        ResultSet rsUsuario = null;

        try {
            psUsuario = conn.prepareStatement(sqlUsuario);
            psUsuario.setString(1, "%"+usu+"%");
            rsUsuario = psUsuario.executeQuery();

            while (rsUsuario.next()) {
                int id= rsUsuario.getInt("idperfil");
                String usua= rsUsuario.getString("usuario");
                String clave = rsUsuario.getString("clave");
                char per = rsUsuario.getString("permiso").charAt(0);
                String nombre = rsUsuario.getString("nombre");
                usuario = new Usuario(id, usua, clave, per, nombre);
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rsUsuario.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return usuario;
    }

    @Override
    public Usuario BuscarUsuarioNombre(String nom) {
        Usuario usuario = null;
        //codigo para selleccionar datos de una tabla con un criterio como filtro
        String sqlUsuario = "SELECT * FROM perfil u WHERE u.nombre like ?";
        PreparedStatement psUsuario = null;
        ResultSet rsUsuario = null;

        try {
            psUsuario = conn.prepareStatement(sqlUsuario);
            psUsuario.setString(1, "%"+nom+"%");
            rsUsuario = psUsuario.executeQuery();

            while (rsUsuario.next()) {
                int id= rsUsuario.getInt("idperfil");
                String usua= rsUsuario.getString("usuario");
                String clave = rsUsuario.getString("clave");
                char per = rsUsuario.getString("permiso").charAt(0);
                String nombre = rsUsuario.getString("nombre");
                usuario = new Usuario(id, usua, clave, per, nombre);
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rsUsuario.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return usuario;   
    }

    @Override
    public Usuario autenticarUsuario(String usu, String clave) {
        Usuario usuario = null;
        String sqlUsuario = "{call sp_autenticar(?,?,?)}";
        try {
            CallableStatement csUsuario = conn.prepareCall(sqlUsuario);
            csUsuario.registerOutParameter(1, java.sql.Types.BOOLEAN);
            csUsuario.setString(2, usu);
            csUsuario.setString(3, clave);
            if (csUsuario.execute()) {
                if (csUsuario.getBoolean(1)) { //si la autenticacion es exitosa, sacamos el resultSet
                    ResultSet rsUsuario = csUsuario.getResultSet();
                    if (rsUsuario.next()) {
                        String usuri = rsUsuario.getString("USUARIO");
                        String nom = rsUsuario.getString("NOMBRE");
                        char per = rsUsuario.getString("PERMISO").charAt(0);
                        usuario = new Usuario(usuri, per, nom);
                    }
                }
            }
            csUsuario.close();
        } catch (SQLException ex) {
            System.out.println("No se pudo autenticar usuario: " + ex.getMessage());
        } finally {
            closeConnection();
        }
        return usuario;
    }
}
