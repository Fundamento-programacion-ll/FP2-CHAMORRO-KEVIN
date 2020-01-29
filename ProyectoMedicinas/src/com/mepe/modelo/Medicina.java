package com.mepe.modelo;

import java.util.Date;

public class Medicina {
private String codigo;
    private String nombre_med;
    private String dosis;
    private Date fecha_ven;
    private String medico_trat;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre_med() {
        return nombre_med;
    }

    public void setNombre_med(String nombre_med) {
        this.nombre_med = nombre_med;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public Date getFecha_ven() {
        return fecha_ven;
    }

    public void setFecha_ven(Date fecha_ven) {
        this.fecha_ven = fecha_ven;
    }

    public String getMedico_trat() {
        return medico_trat;
    }

    public void setMedico_trat(String medico_trat) {
        this.medico_trat = medico_trat;
    }

    public Medicina() {
    }
    //contructor ingresar valores
    public Medicina(String codigo, String nombre_med, String dosis, Date fecha_ven, String medico_trat) {
        this.codigo = codigo;
        this.nombre_med = nombre_med;
        this.dosis = dosis;
        this.fecha_ven = fecha_ven;
        this.medico_trat = medico_trat;
    }
    //CONTRUCTOR MODIFICAR VALORES

    public Medicina(String nombre_med, String dosis, Date fecha_ven, String medico_trat) {
        this.nombre_med = nombre_med;
        this.dosis = dosis;
        this.fecha_ven = fecha_ven;
        this.medico_trat = medico_trat;
    }
    
    @Override
    public String toString() {
        return "MedicinaMetodos{" + "codigo=" + codigo + ", nombre_med=" + nombre_med + ", dosis=" + dosis + ", fecha_ven=" + fecha_ven + ", medico_trat=" + medico_trat + '}';
    }
}
