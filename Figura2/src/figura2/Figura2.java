package figura2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Figura2  {

    public static void main(String[] args) {
        /*p.Dibujo(p.getGraphics());
        JFrame ventana= new JFrame();
        ventana.add(p);
        ventana.setSize(700, 400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        menu();
        
    }
     public static void menu(){
            String op="";
        do {            
            op= JOptionPane.showInputDialog(null, "Escriba una opcion \nPunto\nCirculo\n3.Salir");
            if (op.equalsIgnoreCase("punto")) {
                Punto p= new Punto();
            }else if (op.equalsIgnoreCase("circulo")){
                Circulo c= new Circulo();
            }else {
                op= JOptionPane.showInputDialog(null, "Escriba una opcion \nPunto\nCirculo\n3.Salir");
            }
        } while (op!="3");
        }
    
}
