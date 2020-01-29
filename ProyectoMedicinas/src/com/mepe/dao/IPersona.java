package com.mepe.dao;

import com.mepe.modelo.Persona;
import java.util.List;

public interface IPersona {
    public List<Persona> ListarPersonas();
    public Persona BuscarPersonaID(int id);
    public Persona BuscarPersonaNombre(String nom);
    public Persona BuscarPersonaApellido(String ape);
    public Persona BuscarPersonaTratamiento(String trata);
    public void InsertarPersona(Persona per);
    public void ActualizarPersona(Persona persona);
    public void EliminarPersona(int id);
}
