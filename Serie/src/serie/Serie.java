/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie;

import java.util.Scanner;
import serie.numero;
/**
 *
 * @author Sistemas
 */
public class Serie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el numero a calcular");
        int num=sc.nextInt();
        numero n= new numero(num);
        System.out.println("El resultado es: "+n.calcular());
        
    }
    
}
