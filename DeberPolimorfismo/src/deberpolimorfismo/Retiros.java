package deberpolimorfismo;

public class Retiros extends Transaccion {
    double montoRe;

    public Retiros() {
    }

    public Retiros(double montoRe) {
        this.montoRe = montoRe;
    }

    public Retiros(double montoRe, int cuenta) {
        super(cuenta);
        this.montoRe = montoRe;
    }

    public double getMontoRe() {
        return montoRe;
    }

    public void setMontoRe(double montoRe) {
        this.montoRe = montoRe;
    }

    @Override
    public String ejecutar() {
        return " Número de Cuenta : "+getCuenta()+" su retiro es: "+montoRe;
    }
}
