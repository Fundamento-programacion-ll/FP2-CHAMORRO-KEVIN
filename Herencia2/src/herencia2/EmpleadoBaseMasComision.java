
package herencia2;

public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    double salarioBase;

    public EmpleadoBaseMasComision() {
    }

    public EmpleadoBaseMasComision(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public EmpleadoBaseMasComision(double salarioBase, double ventasBrutas, double tarifaComision) {
        super(ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    public EmpleadoBaseMasComision(double salarioBase, double ventasBrutas, double tarifaComision, String nombre, String apellido, int ci) {
        super(ventasBrutas, tarifaComision, nombre, apellido, ci);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase<0?0:salarioBase;
    }

    
    
    public double ingresos(){
        return salarioBase*super.calcularIngresos();
    
}

    @Override
    public String toString() {
        return  "Empleado base mas comision "+"NOMBRE "+getNombre()+" APELLIDO "+getApellido()+" CI "+getCi()+" Salario base y comison "+ingresos() ;
    }
    
 
    
}
