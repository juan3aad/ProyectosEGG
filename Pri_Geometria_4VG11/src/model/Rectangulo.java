/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.Figura;

/**
 *
 * @author ajuand
 */
public class Rectangulo implements Figura{

    int ancho, alto;
    
    public Rectangulo(int ancho, int alto){
        this.ancho=ancho;
        this.alto=alto;
        
    
    }
    
    @Override
    public double area() {
        return this.alto*this.ancho;
    }

    @Override
    public double perimetro() {
       return 2*(this.alto+this.ancho);
    }
    
}
