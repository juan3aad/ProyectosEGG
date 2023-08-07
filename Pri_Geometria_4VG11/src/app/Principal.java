/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import model.Circulo;
import model.Rectangulo;

/**
 *
 * @author ajuand
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo reta= new Rectangulo(8,20);
        System.out.println("Area: " + reta.area());
        System.out.println("Perimetro: " + reta.perimetro());
        
        Circulo cir = new Circulo(10);
        System.out.println("Area: " + cir.area());
        System.out.println("Perimetro: "+ cir.perimetro());
        
        
        
    }
    
}
