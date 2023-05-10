/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenamvc.app;

import cadenamvc.controller.CadenaMVController;
import cadenamvc.model.CadenaMVC;
import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class CadenaApp {
    
    public static void main(String[] args ){
        
         Scanner leer = new Scanner (System.in);
         
         CadenaMVController cadenaMVController = new CadenaMVController();
         CadenaMVC cadenaMVC= cadenaMVController.crear();
         
        
         cadenaMVController.mostrarCadena(cadenaMVC);
         
         cadenaMVController.mostrarVocales(cadenaMVC);
        
         
         cadenaMVController.invertirFrase(cadenaMVC);
         
         
         
         System.out.println("Ingrese el  caracter a buscar:");
         
         System.out.println("El caracter se encuentra :" + cadenaMVController.vecesRepetido(leer.next().charAt(0),cadenaMVC));
         
         leer.nextLine();
         
         
         
         System.out.println("Ingrese la cadena a comparar: ");
         cadenaMVController.compararLongitud(leer.nextLine(), cadenaMVC);
         
         
         System.out.println("Ingrese la cadena a unir: ");
         System.out.println("Unida : "+cadenaMVController.unirFrases(leer.nextLine(),cadenaMVC));
         
         
         System.out.println("Ingrese el caracter a remplazar en la cadena: ");
         System.out.println("Nueva cadena: "+ cadenaMVController.remplazar(leer.next(), cadenaMVC));
        
         
         System.out.println("Ingrese letra a buscar: ");
         System.out.println("Si se encuentra: "+ cadenaMVController.contiene(leer.next(), cadenaMVC));
        
    }
    
}
