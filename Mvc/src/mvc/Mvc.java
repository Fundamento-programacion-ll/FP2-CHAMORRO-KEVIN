/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import modelo.persona;
import vista.usuario;

/**
 *
 * @author kevin
 */
public class Mvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona kevin=new persona("kevin", "chamorro","condado",'m',178654654,995151541,25, true);
        usuario u=new usuario();
        u.menu();
    }
    
}
