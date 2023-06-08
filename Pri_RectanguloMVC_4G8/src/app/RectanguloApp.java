/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.RectanguloController;
import java.util.Scanner;
import model.Rectangulo;

/**
 *
 * @author ajuand
 */
public class RectanguloApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Rectangulo r= new Rectangulo();
        System.out.println("Ingrese la base: ");
        r.setBase(leer.nextDouble());
                
        System.out.println("Ingrese la altura: ");
        r.setAltura(leer.nextDouble());
        
        
        
        RectanguloController rc= new RectanguloController();
        
        rc.crearRectangulo(r);
        System.out.println("Perimetro: "+rc.calcularPerimetro());
        
        System.out.println("Superficie: "+rc.calcularSuperficie());
        
        rc.dibujarRectangulo();
        
        
        
    }
    
}
