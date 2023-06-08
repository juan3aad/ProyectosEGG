/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.RaicesController;

/**
 *
 * @author ajuand
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RaicesController rc= new RaicesController();
        System.out.println("Discriminante: "+rc.getDiscriminante()); 
        System.out.println("Tiene dos soluciones: "+ rc.tieneRaices());
        System.out.println("Tiene una unica solución: "+rc.tieneRaiz());
        rc.obtenerRaices();
        rc.obtnerRaiz();
        
    }
    
}
