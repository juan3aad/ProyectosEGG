/*
 Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package ejercicioprincipal_guia7;

import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de compañeros:");
        int n = leer.nextInt();
        String[] equipo = new String[n];
        leer.nextLine();// se debe ahregar esta linea cuandos se realiza la lectura de una cadena utilizando nexline a continuación
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Ingrese nombre");
            String nombre = leer.nextLine();

            equipo[i] = nombre;

        }

        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Nombre: " + equipo[i]);

        }
    }

}
