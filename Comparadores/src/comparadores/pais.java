
package comparadores;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class pais {
    private ArrayList <provincias> listaProvincias= new ArrayList<provincias>();

    public pais() {
        this.listaProvincias= new ArrayList<>();
    }

    public ArrayList<provincias> getListProvincias() {
        return listaProvincias;
    }

    public void setListProvincias() {
        int opcion ;

        provincias provincia;

        do {            

            provincia = new provincias();

            agregarProvincia(provincia);

            opcion = JOptionPane.showConfirmDialog(null, "Mas Provincias", "Continuar",JOptionPane.YES_NO_CANCEL_OPTION);

        } while (opcion==JOptionPane.YES_NO_CANCEL_OPTION);     
    }
    
    public void agregarProvincia(provincias pro){
        this.listaProvincias.add(pro);
        
        
    }
    
}
