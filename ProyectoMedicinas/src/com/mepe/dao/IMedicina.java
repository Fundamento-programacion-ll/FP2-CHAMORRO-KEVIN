package com.mepe.dao;

import com.mepe.modelo.Medicina;
import java.util.Date;
import java.util.List;

public interface IMedicina {
    public List<Medicina> ListarMedicinas();
    public Medicina BuscarMedicinaCod (String medicina);
    public Medicina BuscarMedicinaNombre(String nom);
    public Medicina BuscarMedicoTratante(String trat);
    public Medicina BuscarFechaVen(String fecha);
    public void InsertarMedicina(Medicina med);
    public void ActualizarMedicina(Medicina medicina);
    public void EliminarMedicina(String cod);
}
