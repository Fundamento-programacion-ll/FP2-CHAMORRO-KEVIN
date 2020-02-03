package herencia2;

public class Herencia2 {

    public static void main(String[] args) {
        /*  System.out.println("Seleccione una opcion:");
        System.out.println("1. Empleado asalariado");
        System.out.println("2. Empleado por comision");
        System.out.println("3. Empleado por horas");
        System.out.println("4. Empleado base màs comision");
        */
        
        EmpleadoAsalariado ea= new EmpleadoAsalariado(100, "kevin", "ddd", 15151);
        System.out.println(ea);
        EmpleadoBaseMasComision ebc= new EmpleadoBaseMasComision(100, 2202, 1000, "kkkkkk", "ddddd", 1000000);
        System.out.println(ebc);
    }
    
}
