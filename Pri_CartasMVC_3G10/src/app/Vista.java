/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.Scanner;
import model.Carta;

/**
 *
 * @author ajuand
 */
public class Vista {

    public Vista() {
    }

    Scanner leer = new Scanner(System.in);

    public void mostrarMenuPrincipal() {
        System.out.println("-----Juego de cartas----");
        System.out.println("1. barajar");
        System.out.println("2. Siguiente Carta");
        System.out.println("3. Carta disponible");
        System.out.println("4. Dar cartas");
        System.out.println("5. Cartas por monton");
        System.out.println("6. Mostrar barajas");
        System.out.println("7. Reiniciar juego");
        System.out.println("8. Salir");

    }

    //------------------------------------------------
    public int leerOpcion() {
        try {
            return leer.nextInt();
        } catch (Exception e) {
            leer.nextLine();//limpiar el buffer dek escaner
            return -1;
        }
    }

    //----------------------------------------------
    public void mostrarCarta(Carta carta) {
        if (carta != null) {
            System.out.println("Carta: " + carta.toString());
        }
    }

    //---------------------------------------------
    public void mostrarCantidadCartasDisponible(int cantidad) {
        System.out.println("Numero de cartas Disponibles: " + cantidad);
    }

    //---------------------------------------------
    public int leerCantidadCartas() {
        System.out.println("Ingrese el número de cartas a dar: ");
        return leer.nextInt();
    }

    //----------------------------------------------------
    public void mostrarCartas(ArrayList<Carta> cartas, String mensaje) {
        
        System.out.println("======="+ mensaje + "===========");

        if (cartas.size()==0) {
            System.out.println("No hay cartas en el monton.");

        } else {
            System.out.println("Cartas en la " + mensaje +":");
            for (Carta carta : cartas) {
                System.out.println("- " + carta.toString());
            }
        }
    }
}
