/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Rectangulo;

/**
 *
 * @author ajuand
 */
public class RectanguloController {
    private Rectangulo r;

    
    public RectanguloController() {
    }
    
    
    public void crearRectangulo(Rectangulo r){
        this.r = r;
    
        
    }
    
    public double calcularPerimetro(){
        
        return ((r.getBase()+r.getAltura())*2);
    }
    
    public double calcularSuperficie(){
        return ((r.getBase()*r.getAltura())/this.calcularPerimetro());
    }
    
    public void dibujarRectangulo(){
        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                if ((i==0) || i==(r.getAltura()-1))
                {
                    System.out.print("* ");
                }
                else if ((j == 9)||(j==0)){
                
                 System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
    
    
}
