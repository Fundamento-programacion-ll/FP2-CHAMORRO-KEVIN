
package herencia2;


public abstract class  Empleado { 
    String nombre, apellido;
    int ci;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int ci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
    
    
    
    public abstract Double calcularIngresos();
        
}
