package herencia2;

public class EmpleadoPorComision extends Empleado {
    double ventasBrutas;
    double tarifaComision;

    public EmpleadoPorComision() {
    }

    public EmpleadoPorComision(double ventasBrutas, double tarifaComision) {
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public EmpleadoPorComision(double ventasBrutas, double tarifaComision, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas<0?0:ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision<0?0:tarifaComision;
    }


    @Override
    public Double calcularIngresos() {
        return ventasBrutas*tarifaComision;
        
    }

    @Override
    public String toString() {
        return "EmpleadoPorComision " +"NOMBRE "+getNombre()+" APELLIDO "+getApellido()+" CI "+getCi()+ "ventasBrutas " + ventasBrutas + " tarifaComision " + tarifaComision+" salario por comision "+calcularIngresos();
    }
    

    
    
}
