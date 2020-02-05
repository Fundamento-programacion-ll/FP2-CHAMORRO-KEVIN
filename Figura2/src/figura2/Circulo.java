package figura2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;


public class Circulo extends Punto {
    private int radio;

    public Circulo() {
        String radio=JOptionPane.showInputDialog(null,"Ingrese el valor del radio");
        this.radio=Integer.parseInt(radio);
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo(int radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    public void Dibujo(Graphics g) {
        g.setColor(Color.red);
        g.drawOval(super.getX(), super.getY(), getRadio(),getRadio() );
        System.out.println(super.getX()+" "+super.getY());
    }
    
}
