
package figurasherencia;


public class Cuadrado extends Figura {
    public void datosCuadrado(){
        int perimetro=base*4;
        int area=base*base;
        int volumen= base*base*base;
        
        System.out.println("El area es: "+area);
        System.out.println("El perimetro es: "+perimetro);
        System.out.println("El volumen es: "+volumen);
    }
}
