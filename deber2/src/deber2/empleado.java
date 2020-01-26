package deber2;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class empleado {

    private String nombre;
    private String apellido;
    private String fechaIng;
    private String fechaNac;
    private double salario;

    public int[][] getVector() {
        return vector;
    }

    public void setVector(int[][] vector) {
        this.vector = vector;
    }
    
    private int vector[][]; 
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

    public String getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(String fechaIng) {
        this.fechaIng = fechaIng;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
     private void setVector() {
        for (int i = 0; i < this.vector.length; i++) {
            for (int j = 0; j <5; j++) {
                
            }
        }
    }     
     
    public empleado(int dimension) {
        
        super();
        
        vector=new int [dimension][5];
        
        this.setVector();
        
    }

    public empleado() {
    }

   
    
    
}
