package com.mepe.modelo;

import java.util.Date;

public class Persona {
    //definir vaiables para la clase persona
    private int id_persona;
    private String nombre;
    private String apellido;
    private Date fecha_nac;
    private String tratamiento;
    private int edad;
    private boolean mayor_edad;
    //metodos getter y setter de cada variable 
    
    public int getId() {
        return id_persona;
    }

    public void setId(int id) {
        this.id_persona = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public boolean getMayor_edad() {
        return mayor_edad;
    }

    public void setMayor_edad(boolean mayor_edad) {
        this.mayor_edad = mayor_edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //constructor vacio
    public Persona() {
    }
    //constructor todas las variables

    public Persona(int id_persona, String nombre, String apellido, Date fecha_nac, String tratamiento, boolean mayor_edad) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.tratamiento = tratamiento;
        this.mayor_edad = mayor_edad;
    }
    
    //cnstructor para mostrar edad
    public Persona(int id_persona, String nombre, String apellido, Date fecha_nac, String tratamiento, int edad) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.tratamiento = tratamiento;
        this.edad = edad;
    }
    
    //Constructor para ingreso de persona

    public Persona(String nombre, String apellido, Date fecha_nac, String tratamiento, boolean mayor_edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.tratamiento = tratamiento;
        this.mayor_edad = mayor_edad;
    }
    
    //impresion de datos 
    @Override
    public String toString() {
        return "Persona{" + "id=" + id_persona + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha_nac=" + fecha_nac + ", tratamiento=" + tratamiento + ", mayor_edad=" + mayor_edad + '}';
    }
    
}
