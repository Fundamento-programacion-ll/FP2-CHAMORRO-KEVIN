/*
Realizar un proyecto que tenga la clase fecha(dia, mes , anio)

Empleado(nombre,apellidos,fecha_ingreso, fecha_nacimiento, salario)

instanciar la clase Empleado en el main

sacar cual es el empleado con mayor salario y el mas antiguo
 */
package deber2;

import javax.swing.JOptionPane;

public class Deber2 {

    public static void main(String[] args) {
        fecha f= new fecha();
        empleado e= new empleado();
        int dimension=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de empleados:"));
        e.ingresoDatos(dimension);
        System.out.println("Día: "+f.getDia()+" Mes: "+f.getMes()+" Año: "+f.getAnio());
        e.impresionEmpleados(dimension);
        System.out.println(e.masSalario(dimension));
        System.out.println(e.masAntiguo(dimension));
    }
    
}
