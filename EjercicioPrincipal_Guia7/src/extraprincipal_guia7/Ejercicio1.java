/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package extraprincipal_guia7;

import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = leer.nextInt();

        System.out.println("La suma es: " + suma(num1, num2));

    }

    public static int suma(int a, int b) {
        return (a + b);

    }

}
