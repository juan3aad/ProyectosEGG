/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import model.Raices;

/**
 *
 * @author ajuand
 */
public class RaicesController {
    private Raices r;
    Scanner leer = new Scanner(System.in);
    public RaicesController() {
        System.out.println("Ingrese el valor de a: ");
        double a =leer.nextDouble();
        
        System.out.println("Ingrese el valor de b: ");
        double b=leer.nextDouble();
        
        System.out.println("Ingrese el valor c: ");
        double c=leer.nextDouble();
        
        r=new Raices(a,b,c);
        
    }
    
    public double getDiscriminante(){
        return Math.pow(r.getB(),2)-(4*r.getA()*r.getC());
    }
    
    
    public boolean tieneRaices(){
        return (this.getDiscriminante()>0);
    }
    
    public boolean tieneRaiz(){
        return (this.getDiscriminante()==0.0);
    }
    
    public void obtenerRaices(){
        if(this.tieneRaices()){
            System.out.println("Solución 1: " + ((-r.getB() + (this.getDiscriminante()) / (2 * r.getA()))) );
            System.out.println("Solución 1: " + ((-r.getB() - (this.getDiscriminante()) / (2 * r.getA()))) );
            
        }
    }
    
    public void obtnerRaiz(){
        if(this.tieneRaices()){
            System.out.println("Solución 1: " + ((- r.getB() / (2 * r.getA()))));
        }
    }
    
    
}
