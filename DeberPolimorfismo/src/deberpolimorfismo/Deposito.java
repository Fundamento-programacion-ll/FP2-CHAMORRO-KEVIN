package deberpolimorfismo;

public class Deposito extends Transaccion{
    double montoDe;

    public Deposito() {
    }

    public Deposito(double montoDe) {
        this.montoDe = montoDe;
    }

    public Deposito(double montoDe, int cuenta) {
        super(cuenta);
        this.montoDe = montoDe;
    }

    public double getMontoDe() {
        return montoDe;
    }

    public void setMontoDe(double montoDe) {
        this.montoDe = montoDe;
    }

    @Override
    public String ejecutar() {
        return " Número de Cuenta es: "+getCuenta()+" su deposito es: "+montoDe;    
    }
}
