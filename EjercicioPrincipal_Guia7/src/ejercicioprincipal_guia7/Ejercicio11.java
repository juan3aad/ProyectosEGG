/*
 * Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
 */
package ejercicioprincipal_guia7;

import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        String cadena;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cadena:");
        cadena = leer.nextLine();
        String newCadena = "";

        for (int i = 0; i < cadena.length(); i++) {

            switch (cadena.charAt(i)) {
                case 'a':
                case 'A':
                    newCadena = newCadena.concat("@");
                    break;

                case 'e':
                case 'E':
                    newCadena = newCadena.concat("#");
                    break;

                case 'i':
                case 'I':
                    newCadena = newCadena.concat("$");
                    break;

                case 'o':
                case 'O':
                    newCadena = newCadena.concat("%");
                    break;

                case 'u':
                case 'U':
                    newCadena = newCadena.concat("*");
                    break;

                default:
                    newCadena = newCadena.concat(cadena.charAt(i) + "");

            }
        }
        System.out.println("Cadena: " + newCadena);

    }

}
