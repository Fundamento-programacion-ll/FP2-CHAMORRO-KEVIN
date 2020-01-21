/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cedula;

import java.util.Scanner;

/**
 *
 * @author antho
 */
public class Cedula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su número de cédula");
        String numc = sc.next();
        String [] numced = numc.split("");
        String verf = numced[numced.length -1];
        
        
       int dg1,dg2,dg3,dg4,dg5,dg6,dg7,dg8,dg9,dg10;
       int op1,op2,op3 = 0,op4,op5,op6,op7,op8,op9,op10;
       int suma =0, res =0, dverf=0;
       
        if (numc.length()==10){
            
            dg1 = Integer.parseInt(numced[numced.length - 10]);
            dg2 = Integer.parseInt(numced[numced.length - 9]);
            dg3 = Integer.parseInt(numced[numced.length - 8]);
            dg4 = Integer.parseInt(numced[numced.length - 7]);
            dg5 = Integer.parseInt(numced[numced.length - 6]);
            dg6 = Integer.parseInt(numced[numced.length - 5]);
            dg7 = Integer.parseInt(numced[numced.length - 4]);
            dg8 = Integer.parseInt(numced[numced.length - 3]);
            dg9 = Integer.parseInt(numced[numced.length - 2]);
            dverf = Integer.parseInt(numced[numced.length - 1]);
            
            System.out.println(""+dg1+""+dg2+""+dg3+""+dg4+""+dg5+""+dg6+""+dg7+""+dg8+""+dg9+""+dverf);
            //1
            op1= dg1*2;
            if(op1>=9){
            op1 = op1 -9;
            }
            //2
            op2= dg2*1;
            //3
            op3 = dg3*2;
            if(op3>=9){
            op3 = op3 -9;
            }
            
            //4
            op4= dg4*1;
            //5
            op5= dg5*2;
            if(op5>=9){
            op5 = op5 -9;
            }
            //6
            op6= dg6*1;
            //7
            op7= dg7*2;
            if(op7>=9){
            op7 = op7 -9;
            }
            //8
            op8= dg8*1;
            //9
            op9= dg9*2;
            if(op9>=9){
            op9 = op9 -9;
            }
            
            suma = op1 +op2+op3+op4+op5+op6+op7+op8+op9;
            res = suma % 10;
            
            if (res==0){
            if (res == dverf){
                System.out.println("verdad");
            }else {
                System.out.println("CI incorrecta");
            }
            }
            if (res>=1){
                res = 10-res;
                if (res == dverf){
                System.out.println("Digito correcto" );}
            else {
                System.out.println("CI incorrecto");
            }
        }else {
                System.out.println("CI incorrecto");
        }
        
            
    }
    
}
}
