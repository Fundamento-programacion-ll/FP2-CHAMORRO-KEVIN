/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author antho
 */
public class articulo {
    String nombre;
    String descr;
    float precio;
    

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public articulo() {
    }

    public articulo(String nombre, String descr, float precio) {
        this.nombre = nombre;
        this.descr = descr;
        this.precio = precio;
    }

    
    
    
}
