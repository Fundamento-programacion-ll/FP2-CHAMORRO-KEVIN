
package figurasherencia;

public class Triangulo extends Figura{
        public void datosTriangulo(){
        int perimetro=base*3;
        int area=(base*altura)/2;
        int volumen=(area*altura)/3 ;
        
        System.out.println("El area es: "+area);
        System.out.println("El perimetro es: "+perimetro);
        System.out.println("El volumen es: "+volumen);
    }
}
