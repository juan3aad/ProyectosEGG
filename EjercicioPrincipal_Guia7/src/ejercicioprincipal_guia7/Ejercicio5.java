/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicioprincipal_guia7;

import java.util.Scanner;



/**
 *
 * @author ajuand
 */
public class Ejercicio5 {
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        String nombre=leer.next();
        
        System.out.println("Ingrese la edad");
        int edad=leer.nextInt();
        
        
        System.out.println("Nombre: "+ nombre);
        
        System.out.println("Edad:" + edad);
        
        
    }
    
}
