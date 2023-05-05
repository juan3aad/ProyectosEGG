/*
 *Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25
 * and open the template in the editor.
 */
package ejercicioprincipal_guia7;

import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int num1 = leer.nextInt();

        System.out.println("Ingrese el segundo número:");
        int num2 = leer.nextInt();

        if ((num1 > 25) && (num2 > 25)) {
            System.out.println("Los dos numeros son > 25");
        }
        else
        {
            if(num1>25){
                System.out.println("El numero "+ num1 + " es mayor de 25");
            }
            else
            {
                if(num2>25){
                    System.out.println("El numero "+ num2 + " es mayor de 25");
                }
                else
                {
                    System.out.println("Ninguno es mayor que 25");
                }
            }
                
        }
    }

}
