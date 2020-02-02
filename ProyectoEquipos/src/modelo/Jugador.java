package modelo;

import java.util.Date;

public class Jugador {
    private int idJugador;
    private int idEquipo;
    private String nombreJugador;
    private int numeroCamiseta;
    private String nombreCamiseta;
    private Date fechaIngreso;
    private int goles;

    public Jugador() {
    }

    public Jugador(int idJugador, int idEquipo, String nombreJugador, int numeroCamiseta, String nombreCamiseta, Date fechaIngreso, int goles) {
        this.idJugador = idJugador;
        this.idEquipo = idEquipo;
        this.nombreJugador = nombreJugador;
        this.numeroCamiseta = numeroCamiseta;
        this.nombreCamiseta = nombreCamiseta;
        this.fechaIngreso = fechaIngreso;
        this.goles = goles;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombreCamiseta() {
        return nombreCamiseta;
    }

    public void setNombreCamiseta(String nombreCamiseta) {
        this.nombreCamiseta = nombreCamiseta;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    
}
