/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import model.Punto;

/**
 *
 * @author ajuand
 */
public class PuntoController {
    
    

    Scanner leer= new Scanner(System.in);
    
    public Punto crearPuntos(){
        Punto pto=new Punto();
        System.out.println("ingrese punto x1:");
        pto.setX1(leer.nextInt());
        
        System.out.println("Ingrese el punto y1:");
        pto.setY1(leer.nextInt());
        
        
        System.out.println("Ingrese el punto x2:");
        pto.setX2(leer.nextInt());
        
        System.out.println("Ingrese el punto y2:");
        pto.setY2(leer.nextInt());
        
        
        return pto;
        
        
    }
    
    public double calcular(Punto p){
        return Math.sqrt(Math.pow((p.getX2()-p.getX1()), 2) + Math.pow((p.getY2()-p.getY1()), 2));
    }
    
}
