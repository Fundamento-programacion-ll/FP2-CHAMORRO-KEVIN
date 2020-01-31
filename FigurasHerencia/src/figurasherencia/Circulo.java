package figurasherencia;

public class Circulo extends Figura {
        public void datosCirculo(){
        double perimetro=lado*2*Math.PI;
        double area=Math.pow(lado, 2)*Math.PI;
        double volumen= (4/3)*Math.PI*Math.pow(lado, 3);
        
        System.out.println("El area es: "+area);
        System.out.println("La Circunferencia es: "+perimetro);
        System.out.println("El volumen es: "+volumen);
    }
}
