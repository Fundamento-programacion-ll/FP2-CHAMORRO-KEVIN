/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author kevin
 */
public class persona {
    String nombre, apellidos, direccion;
    char genero;
    int cedula, telefono, edad;
    boolean estadoCivil;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public persona(String nombre, String apellidos, String direccion, char genero, int cedula, int telefono, int edad, boolean estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.genero = genero;
        this.cedula = cedula;
        this.telefono = telefono;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", genero=" + genero + ", cedula=" + cedula + ", telefono=" + telefono + ", edad=" + edad + ", estadoCivil=" + estadoCivil + '}';
    }
    
    
}
