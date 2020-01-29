package com.crud.modelo;

import java.util.Date;


public class Cliente {
    private String cedula;
    private String nombre;
    private String apellido;
    private Date nacimiento;
    private int numHijos;
    private double estatura;

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String apellido, Date nacimiento, int numHijos, double estatura) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.numHijos = numHijos;
        this.estatura = estatura;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", nacimiento=" + nacimiento + ", numHijos=" + numHijos + ", estatura=" + estatura + '}';
    }    
}
