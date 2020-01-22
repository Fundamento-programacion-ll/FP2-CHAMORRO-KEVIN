package vista;

import controlador.user;
import javax.swing.JOptionPane;

public class usuario {
    public void menu(){
        int op=0;
        user metodos=new user();
        op=Integer.parseInt(JOptionPane.showInputDialog(null,"Menu \n 1.Agregar persona \n 2.Salir \n",this));
        do {            
            switch(op){
            case 1:
                String nombre=JOptionPane.showInputDialog(null,"Ingrese el nombre a agregar");
                System.out.println(metodos.agregarPersona(nombre));
                break;
            case 2:
                System.out.println(metodos.listaPersonas());
                break;
            default:
                op=3;
                break;
        }
        } while (op!=3);
    }
}
