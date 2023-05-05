package ejercicioprincipal_guia7;

/*
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 */
/**
 *
 * @author ajuand
 */
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        int nota = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la nota:");
        nota = leer.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Ingrese la nota:");
            nota = leer.nextInt();
        }

    }

}
