package deber2;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class empleado {

    private String nombre [];
    private String apellido[];
    private String fechaIng[];
    private String fechaNac[];
    private int salario[];

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String[] getApellido() {
        return apellido;
    }

    public void setApellido(String[] apellido) {
        this.apellido = apellido;
    }

    public String[] getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(String[] fechaIng) {
        this.fechaIng = fechaIng;
    }

    public String[] getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String[] fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int[] getSalario() {
        return salario;
    }

    public void setSalario(int[] salario) {
        this.salario = salario;
    }
    public empleado() {
    }
    
    public void ingresoDatos(int dimension) {
        nombre= new String[dimension];
        apellido= new String[dimension];
        fechaNac= new String[dimension];
        fechaIng= new String[dimension];
        salario= new int[dimension];
        for (int i = 0; i < dimension; i++) {
                nombre[i]=JOptionPane.showInputDialog(null,"Ingrese el nombre del empleado "+(i+1)+":");
                apellido[i]=JOptionPane.showInputDialog(null,"Ingrese el apellido del empleado "+(i+1)+":");
                fechaIng[i]=JOptionPane.showInputDialog(null,"Ingrese la fecha de ingreso separado por guiones(dd-mm-aaaa) del empleado  "+(i+1)+":");
                fechaNac[i]=JOptionPane.showInputDialog(null,"Ingrese la fecha de nacimiento separado por guiones(dd-mm-aaaa) del empleado  "+(i+1)+":");
                salario[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el salario del empleado "+(i+1)+":"));
        }
     }
     public void impresionEmpleados(int dimension){
         for (int i = 0; i < dimension; i++) {
             System.out.println("-----------Empleaado "+(i+1)+"-----------");
             System.out.println("Nombre: "+nombre[i]);
             System.out.println("Apellido: "+apellido[i]);
             System.out.println("Fecha de ingreso: "+fechaIng[i]);
             System.out.println("Fecha de nacimiento: "+fechaNac[i]);
             System.out.println("Salario: "+salario[i]);
         }
     }
     
     public String masSalario(int dimension){
         int ms=0;
         for (int i = 0; i < dimension-1; i++) {
             if(salario[i+1]>salario[i]){
                 ms=i+1;
             }
         }
         return "El empleado con mas salario es: "+nombre[ms];
     }
     
     public String masAntiguo(int dimension){
         int ms=0;                 
         for (int i = 0; i < dimension-1; i++) {
             String fecha1[]=fechaIng[i].split("-");
             String fecha2[]=fechaIng[i++].split("-");
             
             if(Integer.parseInt(fecha2[2])<Integer.parseInt(fecha1[2])){
                 ms=i+1;
             }else if(Integer.parseInt(fecha2[2])==Integer.parseInt(fecha1[2])){
                 if (Integer.parseInt(fecha2[1])<Integer.parseInt(fecha1[1])){
                    ms=i+1;
                 }else if(Integer.parseInt(fecha2[1])==Integer.parseInt(fecha1[1])){
                     if (Integer.parseInt(fecha2[0])<Integer.parseInt(fecha1[0])) {
                         ms=i+1;
                     }
                 } 
             }
         }
         return "El empleado con mas antiguo es: "+nombre[ms];
     }
     
}
