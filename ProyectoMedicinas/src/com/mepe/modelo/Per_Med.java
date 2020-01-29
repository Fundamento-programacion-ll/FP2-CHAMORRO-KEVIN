package com.mepe.modelo;

public class Per_Med {
    int id_per;
    String codigo_med;

    public int getId_per() {
        return id_per;
    }

    public void setId_per(int id_per) {
        this.id_per = id_per;
    }

    public String getCodigo_med() {
        return codigo_med;
    }

    public void setCodigo_med(String codigo_med) {
        this.codigo_med = codigo_med;
    }

    public Per_Med() {
    }

    public Per_Med(int id_per, String codigo_med) {
        this.id_per = id_per;
        this.codigo_med = codigo_med;
    }

    @Override
    public String toString() {
        return "Per_Med{" + "id_per=" + id_per + ", codigo_med=" + codigo_med + '}';
    }
    
}
