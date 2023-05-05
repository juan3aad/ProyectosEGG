/*
 * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package ejercicioprincipal_guia7;

import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int prim, segu;
        System.out.println("Ingrese el primer numero:");
        prim = leer.nextInt();

        System.out.println("Ingrese el segundo numero:");
        segu = leer.nextInt();

        esMultiplo(prim, segu);

    }

    public static void esMultiplo(int primero, int segundo) {
        if (primero % segundo == 0) {
            System.out.println("El primer numero " + primero + "es multiplo de " + segundo);
        } else {
            System.out.println("No es multiplo");
        }

    }

}
