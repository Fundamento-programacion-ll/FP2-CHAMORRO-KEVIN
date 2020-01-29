package com.mepe.modelo;

public class Usuario {
    private int id;
    private String usuario;
    private String clave;
    private char permiso;
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public char getPermiso() {
        return permiso;
    }

    public void setPermiso(char permiso) {
        this.permiso = permiso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario() {
    }
    //Constructor con todas las variables
    public Usuario(int id, String usuario, String clave, char permiso, String nombre) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
        this.permiso = permiso;
        this.nombre = nombre;
    }
    //constructor para ingreso de datos

    public Usuario(String usuario, String clave, char permiso, String nombre) {
        this.usuario = usuario;
        this.clave = clave;
        this.permiso = permiso;
        this.nombre = nombre;
    }
    //constructor para autenticar

    public Usuario(String usuario, char permiso, String nombre) {
        this.usuario = usuario;
        this.permiso = permiso;
        this.nombre = nombre;
    }    

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", usuario=" + usuario + ", clave=" + clave + ", permiso=" + permiso + ", nombre=" + nombre + '}';
    }
}
