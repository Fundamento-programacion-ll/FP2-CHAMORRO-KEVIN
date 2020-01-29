package com.mepe.dao;

import com.mepe.modelo.Persona;
import com.mepe.vista.DatosPersonas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PersonaMetodos implements IPersona {
    //variable para la conexion con la base
    private Connection conn;
    //metodo para asignaar la conexion a la base
    public PersonaMetodos() {
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
    //metodo para traer los varlores de la base a un lista
    @Override
    public List<Persona> ListarPersonas() {
        List<Persona> listaPersonas = new ArrayList<Persona>();
        Persona persona = null;
        //codigo para mostrar todos los daaos de una tabla en excel
        String sqlPersona = "SELECT * FROM persona p";
        Statement stPersona = null;
        ResultSet rsPersona = null;
        try {
            stPersona = conn.createStatement();
            rsPersona = stPersona.executeQuery(sqlPersona);

            while (rsPersona.next()) {
                int id = rsPersona.getInt("id_persona");
                String nom = rsPersona.getString("nombre");
                String ape = rsPersona.getString("apellido");
                Date fecha = rsPersona.getDate("fecha_nac");
                 //Calcular edad 
                DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String fechanacimiento = sdf.format(fecha);
                LocalDate fechaNaci=LocalDate.parse(fechanacimiento, dtf);
                System.out.println(fechaNaci);
                LocalDate fechaActual=LocalDate.now();
                Period edad=Period.between(fechaActual,fechaNaci);
                String tratamiento = rsPersona.getString("tratamiento");
                persona = new Persona(id, nom, ape, fecha, tratamiento, edad.getYears()*(-1));
                listaPersonas.add(persona);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rsPersona.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return listaPersonas;
    }
    //Metodo para filtrar personas por id
    @Override
    public Persona BuscarPersonaID(int id_persona) {
        Persona persona = null;
        //codigo para selleccionar datos de una tabla con un criterio como filtro
        String sqlPersona = "SELECT * FROM persona p WHERE p.id_persona = ?";
        PreparedStatement psPersona = null;
        ResultSet rsPersona = null;

        try {
            psPersona = conn.prepareStatement(sqlPersona);
            psPersona.setInt(1, id_persona);
            rsPersona = psPersona.executeQuery();

            while (rsPersona.next()) {
                int id = rsPersona.getInt("id_persona");
                String nom = rsPersona.getString("nombre");
                String ape = rsPersona.getString("apellido");
                Date fecha = rsPersona.getDate("fecha_nac");
                 //Calcular edad 
                DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String fechanacimiento = sdf.format(fecha);
                LocalDate fechaNaci=LocalDate.parse(fechanacimiento, dtf);
                System.out.println(fechaNaci);
                LocalDate fechaActual=LocalDate.now();
                Period edad=Period.between(fechaActual,fechaNaci);
                String tratamiento = rsPersona.getString("tratamiento");
                persona = new Persona(id, nom, ape, fecha, tratamiento, edad.getYears()*(-1));
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rsPersona.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return persona;
    }

    @Override
    public Persona BuscarPersonaNombre(String nom) {
        Persona persona = null;
        //codigo para selleccionar datos de una tabla con un criterio como filtro
        String sqlPersona = "SELECT * FROM persona p WHERE p.nombre like ? ";
        PreparedStatement psPersona = null;
        ResultSet rsPersona = null;

        try {
            psPersona = conn.prepareStatement(sqlPersona);
            psPersona.setString(1, "%"+nom+"%");
            rsPersona = psPersona.executeQuery();

            while (rsPersona.next()) {
                int id = rsPersona.getInt("id_persona");
                String nombre = rsPersona.getString("nombre");
                String apellido=rsPersona.getString("apellido");
                Date fecha = rsPersona.getDate("fecha_nac");
                 //Calcular edad 
                DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String fechanacimiento = sdf.format(fecha);
                LocalDate fechaNaci=LocalDate.parse(fechanacimiento, dtf);
                System.out.println(fechaNaci);
                LocalDate fechaActual=LocalDate.now();
                Period edad=Period.between(fechaActual,fechaNaci);
                String tratamiento = rsPersona.getString("tratamiento");
                persona = new Persona(id, nombre, apellido, fecha, tratamiento, edad.getYears()*(-1));
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rsPersona.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return persona;
    }

    @Override
    public Persona BuscarPersonaApellido(String ape) {
        Persona persona = null;
        //codigo para selleccionar datos de una tabla con un criterio como filtro
        String sqlPersona = "SELECT * FROM persona  WHERE apellido like ?";
        PreparedStatement psPersona = null;
        ResultSet rsPersona = null;

        try {
            psPersona = conn.prepareStatement(sqlPersona);
            psPersona.setString(1, "%"+ape+"%");
            rsPersona = psPersona.executeQuery();

            while (rsPersona.next()) {
                int id = rsPersona.getInt("id_persona");
                String nom = rsPersona.getString("nombre");
                String apellido=rsPersona.getString("apellido");
                Date fecha = rsPersona.getDate("fecha_nac");
                 //Calcular edad 
                DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String fechanacimiento = sdf.format(fecha);
                LocalDate fechaNaci=LocalDate.parse(fechanacimiento, dtf);
                System.out.println(fechaNaci);
                LocalDate fechaActual=LocalDate.now();
                Period edad=Period.between(fechaActual,fechaNaci);
                String tratamiento = rsPersona.getString("tratamiento");
                persona = new Persona(id, nom, apellido, fecha, tratamiento, edad.getYears()*(-1));
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rsPersona.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return persona;
    }

    @Override
    public Persona BuscarPersonaTratamiento(String trata) {
        Persona persona = null;
        //codigo para selleccionar datos de una tabla con un criterio como filtro
        String sqlPersona = "SELECT * FROM persona p WHERE p.tratamiento like ?";
        PreparedStatement psPersona = null;
        ResultSet rsPersona = null;

        try {
            psPersona = conn.prepareStatement(sqlPersona);
            psPersona.setString(1, "%"+trata+"%");
            rsPersona = psPersona.executeQuery();

            while (rsPersona.next()) {
                int id = rsPersona.getInt("id_persona");
                String nom = rsPersona.getString("nombre");
                String apellido=rsPersona.getString("apellido");
                Date fecha = rsPersona.getDate("fecha_nac");
                 //Calcular edad 
                DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String fechanacimiento = sdf.format(fecha);
                LocalDate fechaNaci=LocalDate.parse(fechanacimiento, dtf);
                System.out.println(fechaNaci);
                LocalDate fechaActual=LocalDate.now();
                Period edad=Period.between(fechaActual,fechaNaci);
                String tratamiento = rsPersona.getString("tratamiento");
                persona = new Persona(id, nom, apellido, fecha, tratamiento, edad.getYears()*(-1));
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rsPersona.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return persona;
    }
    //metodo para insertar datos en las tabas de la base
    @Override
    public void InsertarPersona(Persona per) {
        long fecha = per.getFecha_nac().getTime();
        java.sql.Date fechaNac = new java.sql.Date(fecha);
        //Codigo para insertar dtos en una tabla en sql
        String sqlCliente = "INSERT INTO persona (nombre,apellido,fecha_nac,tratamiento,mayor_edad) "
                + "VALUES(?,?,?,?,?)";
        PreparedStatement psPersona = null;
        try {
            psPersona = conn.prepareStatement(sqlCliente);
            psPersona.setString(1, per.getNombre());
            psPersona.setString(2, per.getApellido());
            psPersona.setDate(3, fechaNac);
            psPersona.setString(4, per.getTratamiento());
            psPersona.setBoolean(5, per.getMayor_edad());
            psPersona.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                psPersona.close();
                closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    //metodo para actualizar datos de una tabla
    @Override
    public void ActualizarPersona(Persona persona) {
        long fecha = persona.getFecha_nac().getTime();
        java.sql.Date fechaNac = new java.sql.Date(fecha);
        //codigo sql para actualizar datos de una tabla
        String sqlPersona = "UPDATE persona SET nombre=?, apellido=?, fecha_nac=?, tratamiento=?, mayor_edad=?"
                + " WHERE id_persona=?";
        PreparedStatement psPersona = null;

        try {
            psPersona = conn.prepareStatement(sqlPersona);
            psPersona.setString(1,persona.getNombre());
            psPersona.setString(2, persona.getApellido());
            psPersona.setDate(3, fechaNac);
            psPersona.setString(4, persona.getTratamiento());
            psPersona.setBoolean(5, persona.getMayor_edad());
            psPersona.setInt(6, DatosPersonas.codId);
            psPersona.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                psPersona.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
    }

    @Override
    public void EliminarPersona(int id) {
        String sqlPerMed = "DELETE FROM per_med WHERE id_persona= ?";
        PreparedStatement psPerMed = null;
        try {
            psPerMed = conn.prepareStatement(sqlPerMed);
            psPerMed.setInt(1, id);
            psPerMed.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                psPerMed.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String sqlPersona = "DELETE FROM persona WHERE id_persona= ?";
        try {
            psPerMed = conn.prepareStatement(sqlPersona);
            psPerMed.setInt(1, id);
            psPerMed.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                psPerMed.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
    }
}