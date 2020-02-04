package deberpolimorfismo;

public class DeberPolimorfismo {

    public static void main(String[] args) {
        Retiros re= new Retiros(1444, 6546);
        System.out.println(re.ejecutar());
        Deposito de= new Deposito(43435, 7657);
        System.out.println(de.ejecutar());
        SolicitudSaldo ss=new SolicitudSaldo(110003, 54645);
        System.out.println(ss.ejecutar());
    }
    
}
