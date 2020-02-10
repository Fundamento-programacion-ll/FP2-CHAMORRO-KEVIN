package figura2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Cilindro extends Circulo{
    private double altura;



    public double getAltura() {

        return altura;

    }



    public void setAltura(double altura) {

        this.altura = altura;

    }



    public Cilindro(int x, int y, double radio, double altura) {

        super(radio, x, y);

        this.altura = altura;

    }

    public Cilindro() {

        super();

        this.altura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura del cilindro"));

    }
    
   public void paint(Graphics g) {

        super.paint(g);
        g.setColor(Color.black);
        g.drawOval(getX(), (int) (getY() + this.altura), (int) super.getRadio(), (int) super.getRadio());
        g.setColor(Color.black);
        g.drawLine((int) (super.getX() + super.getRadio()), (int) (super.getY() + (super.getRadio() / 2)), (int) (super.getX() + super.getRadio()), (int) (super.getY() + this.altura + super.getRadio() - (super.getRadio() / 2)));
        g.drawLine((int) (getX()), (int) (super.getY() + (super.getRadio() / 2)), (int) (super.getX()), (int) (super.getY() + this.altura + super.getRadio() - (super.getRadio() / 2)));
    } 
}
