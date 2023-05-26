/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.AhorcadoController;
import java.util.Scanner;
import model.Ahorcado;

/**
 *
 * @author ajuand
 */
public class AhorcadoAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        AhorcadoController ac = new AhorcadoController();
        ac.crearJuego();

        for (int z = 0; z <= ac.intentos(); z++) {
            System.out.println("Longitud de la palabra: " + ac.longitud());
            System.out.println("Ingrese la letra a buscar:");
            String letra = leer.next();
            ac.buscar(letra);
            ac.encontradas(letra);

            if (ac.intentos() > 0) {
                System.out.println("Numero de oportunidades restantes: " + ac.intentos());
            } else {
                System.out.println("Lo sentimos, no hay más oportunidades");
            }
            z=0;
        }

    }

}
