package com.mepe.modelo;

public class Reporte {
    private String nombreP;
    private String apellidoP;
    private String nombreM;
    private String dosis;

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public Reporte() {
    }

    public Reporte(String nombreP, String apellidoP, String nombreM, String dosis) {
        this.nombreP = nombreP;
        this.apellidoP = apellidoP;
        this.nombreM = nombreM;
        this.dosis = dosis;
    }

    @Override
    public String toString() {
        return "Reporte{" + "nombreP=" + nombreP + ", apellidoP=" + apellidoP + ", nombreM=" + nombreM + ", dosis=" + dosis + '}';
    }
    
}
