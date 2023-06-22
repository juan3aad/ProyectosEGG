/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferenciamvc.controller;

import circunferenciamvc.model.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class CircunferenciaController {
    private Circunferencia c;
    
    Scanner leer = new Scanner(System.in);

    public CircunferenciaController() {
    }

    public CircunferenciaController(Circunferencia c) {
        this.c = c;
    }
    
    public void crearCircunferencia()
    {
        System.out.println("Ingrese el radio: ");
        c.setRadio(leer.nextDouble());
    }
    
    public void area(){
        double area= Math.PI* Math.pow(c.getRadio(), 2); 
        
        System.out.println("El area es: "+ area);
    }
    
    public void perimetro(){
        double perimetro= 2 * Math.PI*c.getRadio();
        System.out.println("El perimetro es: "+ perimetro);
    }
            
    
}
