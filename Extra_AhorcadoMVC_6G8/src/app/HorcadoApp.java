/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.AhorcadoController;
import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class HorcadoApp {

    /**
     * @param args the command line arguments
     */
    public static void juego() {
        Scanner leer = new Scanner(System.in);
        AhorcadoController ahc = new AhorcadoController();
        ahc.crearJuego();

        for (int i = 0; i <= ahc.intentos(); i++) {
            System.out.println("la logitud de la palabra es: " + ahc.longitud());
            System.out.println("Ingrese la letra a buscar: ");
            char leta = leer.next().charAt(0);

            ahc.buscar(leta);
            ahc.encontradas(leta);
            System.out.println("Número de oprtunidades restantes: " + ahc.intentos());
            i = 0;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        juego();
        //ahc.mostrar();
    }

}
