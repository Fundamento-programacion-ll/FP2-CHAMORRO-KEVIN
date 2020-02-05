package figura2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Punto extends Figura{
    private int x, y;

    public Punto() {
        super();
        String datos= JOptionPane.showInputDialog(null, "Ingrese los datos separados por coma");
        StringTokenizer tokens= new StringTokenizer(datos,",");
        
        this.x = Integer.parseInt(tokens.nextToken());
        this.y = Integer.parseInt(tokens.nextToken());
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public void Dibujo(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(x, y, 20, 20);
        System.out.println(this.x+" "+this.y);
    }

    @Override
    public String toString() {
        return "Puntos: "+"x=" + x + ", y=" + y;
    }
    
    
}
