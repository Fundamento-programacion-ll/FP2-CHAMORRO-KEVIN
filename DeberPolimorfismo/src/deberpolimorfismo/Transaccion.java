package deberpolimorfismo;

public abstract class Transaccion {
    int cuenta;

    public Transaccion() {
    }

    public Transaccion(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    public abstract String ejecutar();
    
    public String obtenercuenta(){
    return ejecutar();
    }
}
