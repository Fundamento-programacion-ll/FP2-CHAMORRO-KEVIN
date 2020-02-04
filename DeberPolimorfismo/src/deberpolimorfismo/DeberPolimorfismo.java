package deberpolimorfismo;

import javax.swing.JOptionPane;

public class DeberPolimorfismo {

    public static void main(String[] args) {
        /*Retiros re= new Retiros(1444, 6546);
        System.out.println(re.ejecutar());
        Deposito de= new Deposito(43435, 7657);
        System.out.println(de.ejecutar());
        SolicitudSaldo ss=new SolicitudSaldo(110003, 54645);
        System.out.println(ss.ejecutar());*/
        int cuenta[]= new int[3];
        cuenta[0]=1000;
        cuenta[1]=3000;
        cuenta[2]=6000;
        String usuario[]= new String[3];
        usuario[0]="Usuario 1";
        usuario[1]="Usuario 2";
        usuario[2]="Usuario 3";
        double saldo[]=new double[3];
        saldo[0]=84;
        saldo[1]=43;
        saldo[2]=54;
        
        String us=JOptionPane.showInputDialog(null,"Ingrese el nombre del usuario" );
        String cu=JOptionPane.showInputDialog(null,"Ingrese el numero de cuenta" );
        System.out.println(us);
        System.out.println(cu);
        boolean ic=false;
        for (int i = 0; i <cuenta.length; i++) {
            if (usuario[i].equalsIgnoreCase(us) && cuenta[i]==Integer.parseInt(cu)){
                int pa=i;
                ic=true;
                String op= JOptionPane.showInputDialog(null, "Ingrese una opcion \n1.Consulta de saldo\n2.Retiro\n3.Deposito");
                switch (op){
                    case "1":
                        SolicitudSaldo ss=new SolicitudSaldo(saldo[pa], Integer.parseInt(cu));
                        JOptionPane.showMessageDialog(null, "Nombre de usuario: "+us+" "+ss.ejecutar());
                        break;
                    case "2":
                        String ret=JOptionPane.showInputDialog(null, "Ingrese el monto de retiro");
                        Retiros re= new Retiros(Double.parseDouble(ret),Integer.parseInt(cu));
                        JOptionPane.showMessageDialog(null, "Nombre de usuario: "+us+" "+re.ejecutar());
                        break;
                    case "3":
                        String dep=JOptionPane.showInputDialog(null, "Ingrese el monto de retiro");
                        Deposito de= new Deposito(Double.parseDouble(dep),Integer.parseInt(cu));
                        JOptionPane.showMessageDialog(null, "Nombre de usuario: "+us+" "+de.ejecutar());
                    default:
                        JOptionPane.showMessageDialog(null, "Ingrese una opcion correcta");
                        break;
                }
            }
        }
        if (ic==false) {
            JOptionPane.showMessageDialog(null, "Usuario y cuanta inexistentes");
        } 
    }
}
