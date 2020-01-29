package com.mepe.servicio;

import com.mepe.dao.MedicinaMetodos;
import com.mepe.modelo.Medicina;
import java.util.Date;
import java.util.List;
//servidor de metodos para medicinas
public class MedicinaServ {
    public static List<Medicina> ListarMedicinas(){
        return new MedicinaMetodos().ListarMedicinas();
    }
    public static Medicina BuscarMedicinaCod(String cod){
        return new MedicinaMetodos().BuscarMedicinaCod(cod);
    }
    public static Medicina BuscarMedicinaNombre(String nom){
        return new MedicinaMetodos().BuscarMedicinaNombre(nom);
    }
    public static Medicina BuscarFechaVen(String fec){
        return new MedicinaMetodos().BuscarFechaVen(fec);
    }
    public static Medicina BuscarMedicoTratante(String trata){
        return new MedicinaMetodos().BuscarMedicoTratante(trata);
    }
    public static void InsertarMedicina(Medicina med){
        new MedicinaMetodos().InsertarMedicina(med);
    }
    public static void ActualizarMedicina(Medicina med){
        new MedicinaMetodos().ActualizarMedicina(med);
    }
    public static void EliminarPersona(String cod){
        new MedicinaMetodos().EliminarMedicina(cod);
    }
    
}
