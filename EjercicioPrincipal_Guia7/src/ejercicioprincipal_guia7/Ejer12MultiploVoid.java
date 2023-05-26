/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12multiplo;

import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class Ejer12MultiploVoid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int pri = leer.nextInt();

        System.out.println("Ingrese el segundo número:");
        int seg = leer.nextInt();

        esMultiplo(pri, seg);

    }

    public static void esMultiplo(int primero, int segundo) {

        if (primero % segundo == 0) {
            System.out.println("El primer numero " + primero + " es multiplo del segundo " + segundo);
        } else {
            System.out.println("No es multiplo");
        }
    }
}


