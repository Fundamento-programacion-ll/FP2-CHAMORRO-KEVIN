package trabajo_en_clase_sueldos;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class persona {
    
    private String nombre,apellido,genero;
    private int edad,ci,sueldo;

    public persona() {
        
        String datos;
        datos = JOptionPane.showInputDialog(null, "Ingrese los datos separados por punto y coma "
                + "\n (nombre,apellido,genero,edad,ci,sueldo)");
        StringTokenizer  tokens = new StringTokenizer(datos,",");
        this.nombre = tokens.nextToken();
        this.apellido = tokens.nextToken();
        this.genero = tokens.nextToken();
        this.edad = Integer.parseInt(tokens.nextToken());
        this.ci = Integer.parseInt(tokens.nextToken());
        this.sueldo=Integer.parseInt(tokens.nextToken());
            String are= JOptionPane.showInputDialog(null,"Escriba el area:");
            administrativo ad= new administrativo();
            ad.setArea(are);
    
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public persona(String nombre, String apellido, String genero, int edad, int ci, int sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
        this.ci = ci;
        this.sueldo = sueldo;
    }

    
    
    public  int calcularsueldo(){
    
    return this.sueldo;
    }

    @Override
    public String toString() {
        return "Nombre :" +getNombre() + "Apellido: "+ getApellido();
    }
    
    
    
}
