/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import model.Nif;

/**
 *
 * @author ajuand
 */
public class Nifcontroller {
    private Nif n;
    char [] letrasA={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    
    Scanner leer = new Scanner(System.in);
    
    public void CrearNif(){
        n=new Nif();
        System.out.println("Ingrese el DNI: ");
        
        n.setDni(leer.nextLong());
        
    }
    
    
    public char calcularLetra(){
        
        return letrasA[(int)(n.getDni()%23)];
    }
    
    public void mostrar(){
        System.out.println("El NIF es: "+ n.getDni()+"-"+this.calcularLetra());
    }
    
}
