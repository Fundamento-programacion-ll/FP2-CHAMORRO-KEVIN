package com.mepe.servicio;

import com.mepe.dao.PersonaMetodos;
import com.mepe.modelo.Persona;
import java.util.List;
//servidor de metodos para personas 
public class PersonaServ {
    public static List<Persona> ListarPersonas(){
        return new PersonaMetodos().ListarPersonas();
    }
    public static Persona BuscarPersonaID(int id){
        return new PersonaMetodos().BuscarPersonaID(id);
    }
    public static Persona BuscarPersonaNombre(String nom){
        return new PersonaMetodos().BuscarPersonaNombre(nom);
    }
    public static Persona BuscarPersonaApellido(String ape){
        return new PersonaMetodos().BuscarPersonaApellido(ape);
    }
    public static Persona BuscarPersonaTratamiento(String trata){
        return new PersonaMetodos().BuscarPersonaTratamiento(trata);
    }
    public static void InsertarPersona(Persona per){
        new PersonaMetodos().InsertarPersona(per);
    }
    public static void ActualizarPersona(Persona persona){
        new PersonaMetodos().ActualizarPersona(persona);
    }
    public static void EliminarPersona(int id){
        new PersonaMetodos().EliminarPersona(id);
    }
}
