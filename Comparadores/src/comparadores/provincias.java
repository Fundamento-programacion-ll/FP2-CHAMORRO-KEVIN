
package comparadores;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class provincias {
    private String nombreprovincia;
    private int numerohabitantes;

    public provincias() {
        String datos= JOptionPane.showInputDialog(null, "Ingrese los datos separados por coma");
        StringTokenizer tokens= new StringTokenizer(datos,",");
        
        this.nombreprovincia = tokens.nextToken();
        this.numerohabitantes = Integer.parseInt(tokens.nextToken());
    }

    public provincias(String nombreprovincia, int numerohabitantes) {
        this.nombreprovincia = nombreprovincia;
        this.numerohabitantes = numerohabitantes;
    }

    public String getNombreprovincia() {
        return nombreprovincia;
    }

    public void setNombreprovincia(String nombreprovincia) {
        this.nombreprovincia = nombreprovincia;
    }

    public int getNumerohabitantes() {
        return numerohabitantes;
    }

    public void setNumerohabitantes(int numerohabitantes) {
        this.numerohabitantes = numerohabitantes;
    }
    
}
