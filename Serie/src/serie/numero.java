/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie;

/**
 *
 * @author Sistemas
 */
public class numero {
    int numero;



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public numero(int numero) {
        this.numero = numero;
    }

    

    @Override
    public String toString() {
        return "numero{" + "numero=" + numero + '}';
    }
    
    public int calcular(){
        int result=1;
        for (int i = 1; i <= numero; i++) {
            result=result*2;
        }
        return result;
    }
}
