package herencia2;

public class Herencia2 {

    public static void main(String[] args) {
        
        EmpleadoAsalariado ea= new EmpleadoAsalariado(100, "kevin", "ddd", 15151);
        System.out.println(ea);
        EmpleadoBaseMasComision ebc= new EmpleadoBaseMasComision(100, 2202, 1000, "kkkkkk", "ddddd", 1000000);
        System.out.println(ebc);
        EmpleadoPorComision ec= new EmpleadoPorComision(100, 22, "kkkk", "ddd", 115151);
        System.out.println(ec);
        EmpleadoPorHoras eh= new EmpleadoPorHoras(2000, 2, "kkkk", "dddd",165125);
        System.out.println(eh);
    }
    
}
