package com.crud.dao;

import com.crud.modelo.Cliente;
import com.crud.modelo.Perfil;
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

public class ClienteMetodos implements ICliente {

    private Connection conn;

    public ClienteMetodos() {
        if (conn == null) {
            conn = ConexionJDBC.getConnection();
        }
    }

    private void closeConnection() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(" Error al cerrar la conexion " + ex.getMessage());
        }
    }

    @Override
    public List<Cliente> ListarClientes() {
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        Cliente cliente = null;
        String sqlClientes = "SELECT * FROM cliente c";
        Statement stCliente = null;
        ResultSet rsCliente = null;
        try {
            stCliente = conn.createStatement();
            rsCliente = stCliente.executeQuery(sqlClientes);

            while (rsCliente.next()) {
                String ced = rsCliente.getString("cedula");
                String nom = rsCliente.getString("nombre");
                String ape = rsCliente.getString("apellido");
                Date fecha = rsCliente.getDate("fecha_nac");
                int hijos = rsCliente.getInt("num_hijos");
                double est = rsCliente.getDouble("estatura");
                cliente = new Cliente(ced, nom, ape, fecha, hijos, est);
                listaClientes.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rsCliente.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return listaClientes;
    }

    @Override
    public Cliente BuscarClienteCedula(String cedula) {
        Cliente cliente = null;
        String sqlCliente = "SELECT * FROM cliente c WHERE c.cedula = ?";
        PreparedStatement psCliente = null;
        ResultSet rsCliente = null;

        try {
            psCliente = conn.prepareStatement(sqlCliente);
            psCliente.setString(1, cedula);
            rsCliente = psCliente.executeQuery();

            while (rsCliente.next()) {
                String nombre = rsCliente.getString("nombre");
                String apellido = rsCliente.getString("apellido");
                Date fecha = rsCliente.getDate("fecha_nac");
                int hijos = rsCliente.getInt("num_hijos");
                double estatura = rsCliente.getDouble("estatura");
                cliente = new Cliente(cedula, nombre, apellido, fecha, hijos, estatura);
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rsCliente.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return cliente;
    }

    @Override
    public void InsertarCliente(Cliente cli) {
        long fecha = cli.getNacimiento().getTime();
        java.sql.Date fechaNac = new java.sql.Date(fecha);

        String sqlCliente = "INSERT INTO cliente (cedula, nombre, apellido, "
                + "fecha_nac, num_hijos, estatura) "
                + "VALUES(?,?,?,?,?,?)";
        PreparedStatement psCliente = null;
        try {
            psCliente = conn.prepareStatement(sqlCliente);
            psCliente.setString(1, cli.getCedula());
            psCliente.setString(2, cli.getNombre());
            psCliente.setString(3, cli.getApellido());
            psCliente.setDate(4, fechaNac);
            psCliente.setInt(5, cli.getNumHijos());
            psCliente.setDouble(6, cli.getEstatura());
            psCliente.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                psCliente.close();
                closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void ActualizarCliente(Cliente cliente) {
        long fecha = cliente.getNacimiento().getTime();
        java.sql.Date fechaNac = new java.sql.Date(fecha);

        String sqlCliente = "UPDATE cliente SET nombre=?, apellido=?, fecha_nac=?, num_hijos=?, estatura=? "
                + "WHERE cedula=?";
        PreparedStatement psCliente = null;

        try {
            psCliente = conn.prepareStatement(sqlCliente);
            psCliente.setString(1, cliente.getNombre());
            psCliente.setString(2, cliente.getApellido());
            psCliente.setDate(3, fechaNac);
            psCliente.setInt(4, cliente.getNumHijos());
            psCliente.setDouble(5, cliente.getEstatura());
            psCliente.setString(6, cliente.getCedula());
            psCliente.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                psCliente.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
    }

    @Override
    public void EliminarCliente(String ced) {
        String sqlCliente = "DELETE FROM cliente WHERE cedula=?";
        PreparedStatement psCliente = null;

        try {
            psCliente = conn.prepareStatement(sqlCliente);
            psCliente.setString(1, ced);
            psCliente.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                psCliente.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
    }

    @Override
    public Perfil autenticarUsuario(String usuario, String clave) {
        Perfil perfil = null;
        String sqlPerfil = "{call sp_autenticar(?,?,?)}";
        try {
            CallableStatement csPerfil = conn.prepareCall(sqlPerfil);
            csPerfil.registerOutParameter(1, java.sql.Types.BOOLEAN);
            csPerfil.setString(2, usuario);
            csPerfil.setString(3, clave);
            if (csPerfil.execute()) {
                if (csPerfil.getBoolean(1)) { //si la autenticacion es exitosa, sacamos el resultSet
                    ResultSet rsPerfil = csPerfil.getResultSet();
                    if (rsPerfil.next()) {
                        String usu = rsPerfil.getString("USUARIO");
                        String nom = rsPerfil.getString("NOMBRE");
                        char per = rsPerfil.getString("PERMISO").charAt(0);
                        perfil = new Perfil(usu, nom, per);
                    }
                }
            }
            csPerfil.close();
        } catch (SQLException ex) {
            System.out.println("No se pudo autenticar usuario: " + ex.getMessage());
        } finally {
            closeConnection();
        }
        return perfil;
    }
}
