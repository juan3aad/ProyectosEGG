/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.PuntoController;
import model.Punto;

/**
 *
 * @author ajuand
 */
public class PuntoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PuntoController pc= new PuntoController();
        Punto p=  pc.crearPuntos();
        
        System.out.println("La distancia entre los puntos ("+p.getX1() +","+p.getY1()+") y ("+ p.getX2()+","+p.getY2()+") es =>"+pc.calcular(p));
        
        
    }
    
}
