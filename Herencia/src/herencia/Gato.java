
package herencia;

public class Gato extends Animal {
    String colorOjos;

    public Gato(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public Gato(String colorOjos, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.colorOjos = colorOjos;
    }
    
    
    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    
    public void datosGato(){
        System.out.println(getNombre()+" "+getColorOjos()+" "+getGenero());
    }
}
