/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

/**
 *
 * @author ajuand
 */
  



import java.util.Scanner;


/**
 *
 * @author erika
 */
public class EjercicioExtra_36 {
    
    
    public static void main(String[] args)  {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        
        do {
            
            System.out.println("\r ingrese el nombre de la persona:");
            nombre = leer.nextLine();
            

            System.out.println("\r Ingrese la edad de ");
            edad = leer.nextInt();
            
            nombre = nombre.toLowerCase();
             
            if (edad>=18) {
                System.out.println(nombre+" es mayor de edad");
              
            }else{
                System.out.println(nombre+" es menor de edad");
            }
            
            leer.nextLine();
            
            
        } while (!(nombre.equals("no")));
        
    }
    
}