package deber2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class fecha {
    Calendar c1 = Calendar.getInstance();
    Calendar c2 = new GregorianCalendar();
    
    int dia ;
    int mes;
    int anio;
    
    public int getDia() {
        dia =  c2.get(Calendar.DATE);
        return dia;
    }

    public void setDia(int dia) {
        
        this.dia = dia;
    }
    
    public int getMes() {
        mes = c2.get(Calendar.MONTH);
        mes = mes+1;
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        anio = c2.get(Calendar.YEAR);
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public fecha() {
    }

    public fecha(int dia, int mes, int anio) {
        this.dia = getDia();
        this.mes = getMes();
        this.anio = getAnio();
    }  

    
    
    
    
}
