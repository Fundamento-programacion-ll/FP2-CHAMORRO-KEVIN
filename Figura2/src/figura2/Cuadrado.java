
package figura2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;


public class Cuadrado extends Punto {
    private int lado;

    public Cuadrado() {
        String lado=JOptionPane.showInputDialog(null,"Ingrese el valor del lado");
        this.lado=Integer.parseInt(lado);
    }

    public Cuadrado(int lado, int x, int y) {
        super(x, y);
        this.lado = lado;
    }
    
    public void paint(Graphics g) {        

        g.setColor(Color.DARK_GRAY);

        g.drawRect(super.getX(), super.getY(), lado, lado);
    }
}
