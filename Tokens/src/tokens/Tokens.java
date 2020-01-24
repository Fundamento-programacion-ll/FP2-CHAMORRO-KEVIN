/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Tokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dimension = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Dimension del Arreglo"));
        
        Vector v=new Vector(dimension);
        
        System.out.println(v);
        
    }
 
    
}
