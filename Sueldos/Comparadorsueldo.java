package trabajo_en_clase_sueldos;

import java.util.Comparator;

public class Comparadorsueldo implements Comparator{
     
    
    int compararNombre;
    persona per1, per2;
    @Override
    public int compare(Object t, Object t1) {
        per1 = (persona)t;
        per2 = (persona)t1;
        compararNombre = (per1.getNombre()
                .compareToIgnoreCase(per2.getNombre()));
        return compararNombre;
    }
    
}
