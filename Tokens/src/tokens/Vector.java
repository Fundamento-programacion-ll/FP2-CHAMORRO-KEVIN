/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Vector {
    
    private int vector[];

    public int[] getVector() {
        return vector;
    }

    public void setVector() {
        
        String datosVector; 
        
        datosVector = JOptionPane.showInputDialog(null, "Ingrese los Datos separados por coma");
        
        StringTokenizer tokkens=new StringTokenizer(datosVector, ","); //datos,separador
        
        for (int i = 0; i < this.vector.length&&tokkens.hasMoreTokens(); i++) {
            
            this.vector[i] = Integer.parseInt(tokkens.nextToken());
            
        }
    }

    public Vector(int[] vector) {
        
        super();
        
        this.vector = vector;
    }
    
    public Vector(int dimension) {
        
        super();
        
        vector=new int [dimension];
        
        this.setVector();
        
    }
    
    public Vector() {
    }
    
     @Override
    public String toString() {
        return "vector: "+Arrays.toString(vector); //To change body of generated methods, choose Tools | Templates.
    }
    
}

