
package trabajo_en_clase_sueldos;

import java.util.Comparator;

public class comparadornombre implements Comparator{
    
    int compararNombre;
    persona per1, per2;

    @Override
    public int compare(Object t, Object t1) {
        per1 = (persona)t;
        per2 = (persona)t1;
        if (per1.getSueldo()
                > per2.getSueldo()) {
            compararNombre = 1;
        } else {
            compararNombre =  -1;
        }       
        return compararNombre;
    }   
}
