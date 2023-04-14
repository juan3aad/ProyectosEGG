/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif;

import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        //Pedri los numeros
        System.out.println("Escriba el primer numero:");
        int num1 = leer.nextInt();
        System.out.println("Escriba el siguiente numero");
        int num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("El numero " + num1 + " y el numero " + num2 + "Son mayores que 25");
        } else if (num1 > 25) {
            System.out.println("El numero " + num1 + " es mayor que 25");
        } else if (num2 > 25) {
            System.out.println("El numero " + num2 + " es mayor que 25");
        }else
        {
            System.out.println("Ninguno es mayor a 25");
        }

    }

}
