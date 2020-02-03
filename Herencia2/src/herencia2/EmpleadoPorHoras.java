package herencia2;

public class EmpleadoPorHoras extends Empleado{
    double sueldo;
    double horas;

    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(double sueldo, double horas) {
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public EmpleadoPorHoras(double sueldo, double horas, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo<0?0:sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = (horas>0 && horas<=168)? horas:0;
    }

    @Override
    public Double calcularIngresos() {
        return horas*sueldo;
        
    }

     
}
