package trabajo_en_clase_sueldos;

import javax.swing.JOptionPane;

public class Trabajo_en_clase_sueldos {

    public static void main(String[] args) {
        lista_persona l = new lista_persona();
        String salida="";
        l.setListapersonas();
        salida = "Lista Personas: \n"+l.toString();
        System.out.println(salida);
        
        l.ordenarPorNombreProvincia();
        salida = "Lista Personas por Nombre: \n"+l.toString();
        System.out.println(salida);
        
        l.ordenarPorNumero();        
        salida = "Lista Personas por Sueldo: \n"+l.toString();
        System.out.println(salida);
        
    }   
}