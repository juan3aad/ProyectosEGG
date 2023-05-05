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
public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int cont=0,acum=0;

        do {

            System.out.println("Ingrese el número");
            num1 = leer.nextInt();
            
            if(num1==0)
            {
                System.out.println("Se capturo el numero cero");
                break;
            }
            else
            {
                if(num1>=0)
                {
                    acum=acum+num1;
                }
            }
            cont++;
        } while (num1 != 0 && cont<20);
        
        System.out.println("El resultado de la suma es: "+acum);

    }

}
