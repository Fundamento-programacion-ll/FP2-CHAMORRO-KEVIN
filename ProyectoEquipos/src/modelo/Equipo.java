package modelo;

import java.util.Date;

public class Equipo {
    private int idEquipo;
    private String nombreEquipo;
    private String liga;
    private Date fechaCreacion;
    private int numeroInter;
    private boolean campeonActual;

    public Equipo() {
    }

    public Equipo(int idEquipo, String nombreEquipo, String liga, Date fechaCreacion, int numeroInter, boolean campeonActual) {
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
        this.liga = liga;
        this.fechaCreacion = fechaCreacion;
        this.numeroInter = numeroInter;
        this.campeonActual = campeonActual;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getNumeroInter() {
        return numeroInter;
    }

    public void setNumeroInter(int numeroInter) {
        this.numeroInter = numeroInter;
    }

    public boolean isCampeonActual() {
        return campeonActual;
    }

    public void setCampeonActual(boolean campeonActual) {
        this.campeonActual = campeonActual;
    }
    
    
}
