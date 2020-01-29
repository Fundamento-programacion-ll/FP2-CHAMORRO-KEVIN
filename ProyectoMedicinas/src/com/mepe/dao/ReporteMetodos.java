package com.mepe.dao;

import com.mepe.modelo.Reporte;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReporteMetodos implements IReporte{

    private Connection conn;
    public ReporteMetodos() {
        if (conn==null)
        conn=ConexionJDBC.getConnection();
    }
    
    private void closeConection(){
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println("No se pudo cerrar la conexion");
            }
    }
    //Select nombre_cliente, Apellido, tratamiento, verf_edad, nombre_medicamento,dosis,medico_tratante
    //from cliente c, cliente_medicamento cm, medicamento m where cm.cod_medicamento = m.cod_medicamento;
    //end;
    //call registroMedicinas;

    @Override
    public List<Reporte> Ireporte() {
        List<Reporte> listaR = new ArrayList<Reporte>();
        Reporte rep=null;
        String sqlRep = "{call registroMedicinas}";
        CallableStatement csMed = null;
        ResultSet rsMed = null;
             try {                
                csMed = conn.prepareCall(sqlRep);
                rsMed = csMed.executeQuery(sqlRep);
                while(rsMed.next()){
                String nomc= rsMed.getString("nombre");
                String apell= rsMed.getString("apellido");
                String nommed = rsMed.getString("nombre_med");
                String dosis = rsMed.getString("dosis");
                rep = new Reporte(nomc, apell, nommed, dosis);
                listaR.add(rep);
                } 
                 csMed.execute();
             } catch (SQLException ex) {
                 Logger.getLogger(ReporteMetodos.class.getName()).log(Level.SEVERE, null, ex);
             }finally{
            try {
                csMed.close();
            } catch (SQLException ex) {
                Logger.getLogger(ReporteMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConection();
             }
            return listaR;
    }
   


    
}
