/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segun;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Segun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       byte TipoMotor = leer.nextByte();
       
       switch(TipoMotor){
           case 1:
               System.out.println("La bomba es una bomba de agua");
               break;
           case 2:
               System.out.println("la bomba es una bomba de gasolina");
               break;
           case 3:
               System.out.println("la bomba es una bomba de tipo hormigon");
               break;
           case 4:
               System.out.println("la bomba es una bomba de tipo alimenticia");
               break;
           default:
               System.out.println("no existe un válido para este tipo de bomba");

       }
               
               
    }
    
}
