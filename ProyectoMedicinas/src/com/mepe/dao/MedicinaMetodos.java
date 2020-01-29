package com.mepe.dao;

import com.mepe.modelo.Medicina;
import com.mepe.vista.DatosMedicina;
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

public class MedicinaMetodos implements IMedicina {
     //variable para la conexion con la base
    private Connection conn;
    //metodo para asignaar la conexion a la base
    public MedicinaMetodos() {
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
    public List<Medicina> ListarMedicinas() {
        List<Medicina> listaMedicinas = new ArrayList<Medicina>();
        Medicina medicina= null;
        //codigo para mostrar todos los daaos de una tabla en excel
        String sqlMedicina = "SELECT * FROM medicina m";
        Statement stMedicina = null;
        ResultSet rsMedicina = null;
        try {
            stMedicina = conn.createStatement();
            rsMedicina = stMedicina.executeQuery(sqlMedicina);

            while (rsMedicina.next()) {
                String cod = rsMedicina.getString("codigo");
                String nom = rsMedicina.getString("nombre_med");
                String dosis = rsMedicina.getString("dosis");
                Date fecha = rsMedicina.getDate("fecha_ven");
                String med_trat = rsMedicina.getString("medico_trat");
                medicina=new Medicina(cod, nom, dosis, fecha, med_trat);
                listaMedicinas.add(medicina);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rsMedicina.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return listaMedicinas;
    }

    @Override
    public Medicina BuscarMedicinaCod(String cod) {
        Medicina medicina = null;
        //codigo para selleccionar datos de una tabla con un criterio como filtro
        String sqlMedicina = "SELECT * FROM medicina m WHERE m.codigo  like ?";
        PreparedStatement psMedicina = null;
        ResultSet rsMedicina = null;

        try {
            psMedicina = conn.prepareStatement(sqlMedicina);
            psMedicina.setString(1, "%"+cod+"%");
            rsMedicina = psMedicina.executeQuery();

            while (rsMedicina.next()) {
                String codigo = rsMedicina.getString("codigo");
                String nombre = rsMedicina.getString("nombre_med");
                String dosis = rsMedicina.getString("dosis");
                Date fecha = rsMedicina.getDate("fecha_ven");
                String med_trat = rsMedicina.getString("medico_trat");
                medicina=new Medicina(codigo, nombre, dosis, fecha, med_trat);
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rsMedicina.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return medicina;
    }

    @Override
    public Medicina BuscarMedicinaNombre(String nom) {
Medicina medicina = null;
        //codigo para selleccionar datos de una tabla con un criterio como filtro
        String sqlMedicina = "SELECT * FROM medicina m WHERE m.nombre_med like ?";
        PreparedStatement psMedicina = null;
        ResultSet rsMedicina = null;

        try {
            psMedicina = conn.prepareStatement(sqlMedicina);
            psMedicina.setString(1, "%"+nom+"%");
            rsMedicina = psMedicina.executeQuery();

            while (rsMedicina.next()) {
                String codigo = rsMedicina.getString("codigo");
                String nombre = rsMedicina.getString("nombre_med");
                String dosis = rsMedicina.getString("dosis");
                Date fecha = rsMedicina.getDate("fecha_ven");
                String med_trat = rsMedicina.getString("medico_trat");
                medicina=new Medicina(codigo, nombre, dosis, fecha, med_trat);
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rsMedicina.close();
            } catch (SQLException ex) {
                Logger.getLogger(MedicinaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return medicina;    }

    @Override
    public Medicina BuscarMedicoTratante(String trat) {
        Medicina medicina = null;
        //codigo para selleccionar datos de una tabla con un criterio como filtro
        String sqlMedicina = "SELECT * FROM medicina m WHERE m.medico_trat like ?";
        PreparedStatement psMedicina = null;
        ResultSet rsMedicina = null;

        try {
            psMedicina = conn.prepareStatement(sqlMedicina);
            psMedicina.setString(1, "%"+trat+"%");
            rsMedicina = psMedicina.executeQuery();

            while (rsMedicina.next()) {
                String codigo = rsMedicina.getString("codigo");
                String nombre = rsMedicina.getString("nombre_med");
                String dosis = rsMedicina.getString("dosis");
                Date fecha = rsMedicina.getDate("fecha_ven");
                String med_trat = rsMedicina.getString("medico_trat");
                medicina=new Medicina(codigo, nombre, dosis, fecha, med_trat);
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rsMedicina.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return medicina;
    }

    @Override
    public Medicina BuscarFechaVen(String fec) {
Medicina medicina = null;
        //codigo para selleccionar datos de una tabla con un criterio como filtro
        String sqlMedicina = "SELECT * FROM medicina m WHERE m.dosis like ?";
        PreparedStatement psMedicina = null;
        ResultSet rsMedicina = null;

        try {
            psMedicina = conn.prepareStatement(sqlMedicina);
            psMedicina.setString(1, fec+"%");
            rsMedicina = psMedicina.executeQuery();

            while (rsMedicina.next()) {
                String codigo = rsMedicina.getString("codigo");
                String nombre = rsMedicina.getString("nombre_med");
                String dosis = rsMedicina.getString("dosis");
                Date fecha = rsMedicina.getDate("fecha_ven");
                String med_trat = rsMedicina.getString("medico_trat");
                medicina=new Medicina(codigo, nombre, dosis, fecha, med_trat);
            }
        } catch (SQLException ex) {
            System.out.println("No se puede obtener contactos " + ex.getMessage());
        } finally {
            try {
                rsMedicina.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
        return medicina;    }

    @Override
    public void InsertarMedicina(Medicina med) {
        long fecha = med.getFecha_ven().getTime();
        java.sql.Date fechaVen = new java.sql.Date(fecha);
        //Codigo para insertar dtos en una tabla en sql
        String sqlMedicina = "INSERT INTO medicina (codigo,nombre_med,dosis,fecha_ven,medico_trat) "
                + "VALUES(?,?,?,?,?)";
        PreparedStatement psMedicina = null;
        try {
            psMedicina = conn.prepareStatement(sqlMedicina);
            psMedicina.setString(1, med.getCodigo());
            psMedicina.setString(2, med.getNombre_med());
            psMedicina.setString(3, med.getDosis());
            psMedicina.setDate(4, fechaVen);
            psMedicina.setString(5, med.getMedico_trat());
            psMedicina.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                psMedicina.close();
                closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void ActualizarMedicina(Medicina med) {
         long fecha = med.getFecha_ven().getTime();
        java.sql.Date fechaVen = new java.sql.Date(fecha);
        //codigo sql para actualizar datos de una tabla
        String sqlMedicina = "UPDATE medicina SET nombre_med=?, dosis=?,fecha_ven=?, medico_trat=?"
                + " WHERE codigo=?";
        PreparedStatement psMedicina = null;

        try {
            psMedicina = conn.prepareStatement(sqlMedicina);
            psMedicina.setString(5, DatosMedicina.codigo);
            psMedicina.setString(1, med.getNombre_med());
            psMedicina.setString(2, med.getDosis());
            psMedicina.setDate(3, fechaVen);
            psMedicina.setString(4, med.getMedico_trat());
            psMedicina.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                psMedicina.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }
    }

    @Override
    public void EliminarMedicina(String cod) {
        String sqlPerMed = "DELETE FROM per_med WHERE codigo=?";
        PreparedStatement psMedicina = null;
        try {
            psMedicina = conn.prepareStatement(sqlPerMed);
            psMedicina.setString(1, cod);
            psMedicina.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                psMedicina.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        String sqlMedicina = "DELETE FROM medicina WHERE codigo=?";
        try {
            psMedicina = conn.prepareStatement(sqlMedicina);
            psMedicina.setString(1, cod);
            psMedicina.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                psMedicina.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonaMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
        }    
    }
}
    
        
}
