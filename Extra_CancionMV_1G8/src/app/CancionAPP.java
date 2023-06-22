/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.CancionController;
import model.Cancion;

/**
 *
 * @author ajuand
 */
public class CancionAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion c= new Cancion();
        CancionController cc = new  CancionController(c);
        cc.crearCancion();
         cc.mostrar();
        
    }
    
}
