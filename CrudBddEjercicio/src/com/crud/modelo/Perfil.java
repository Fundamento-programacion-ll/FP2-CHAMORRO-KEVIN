package com.crud.modelo;

public class Perfil {
    private String usuario;
    private String nombre;
    private char permiso;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getPermiso() {
        return permiso;
    }

    public void setPermiso(char permiso) {
        this.permiso = permiso;
    }

    public Perfil(String usuario, String nombre, char permiso) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.permiso = permiso;
    }

    @Override
    public String toString() {
        return "Perfil{" + "usuario=" + usuario + ", nombre=" + nombre + ", permiso=" + permiso + '}';
    }
    
    
    
    
    
}
