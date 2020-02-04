package deberpolimorfismo;

public class SolicitudSaldo extends Transaccion{
    double valor;

    public SolicitudSaldo() {
    }

    public SolicitudSaldo(double valor) {
        this.valor = valor;
    }

    public SolicitudSaldo(double valor, int cuenta) {
        super(cuenta);
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String ejecutar() {
        return " Su número de Cuenta es: "+getCuenta()+" su saldo es: "+valor;    
    }
}
