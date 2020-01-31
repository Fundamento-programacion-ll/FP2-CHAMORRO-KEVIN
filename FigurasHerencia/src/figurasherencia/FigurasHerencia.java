
package figurasherencia;

import java.util.Scanner;

public class FigurasHerencia {

    public static void main(String[] args) {
        System.out.println("Seleccionar figura");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triangulo");
        System.out.println("3.Circulo");
        Scanner sc= new Scanner(System.in);
        Cuadrado c= new Cuadrado();
        Triangulo t= new Triangulo();
        Circulo cir= new Circulo();
        int op=sc.nextInt();
        switch (op){
            case 1:
                System.out.println("Ingrese el lado del cuadrado:");
                c.base=sc.nextInt();
                c.datosCuadrado();
                break;
            case 2:
                System.out.println("Ingrese la base del triangulo:");
                t.base=sc.nextInt();
                System.out.println("Ingrese la altura del triangulo:");
                t.altura=sc.nextInt();
                break;
            case 3:
                System.out.println("Ingrese el radio del circulo:");
                cir.lado=sc.nextInt();
                cir.datosCirculo();
                break;
            default:
                System.out.println("Ingrese un opcion correcta");
                break;
        }
              
    
    
    }
    
}
