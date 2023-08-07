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
public class Circulo implements Figura{
   double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
   
   
    @Override
    public double area() {
        return (Pi*(Math.pow(this.radio,2)));
    }

    @Override
    public double perimetro() {
       return (2*Pi*this.radio);
    }
    
    
}
