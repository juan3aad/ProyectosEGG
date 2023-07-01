/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.EquipoController;
import controller.JugadorController;
import java.util.ArrayList;
import java.util.Scanner;
import model.Jugador;

/**
 *
 * @author ajuand
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        JugadorController jc = new JugadorController();
        ArrayList<Jugador> jugadores=new ArrayList();

        EquipoController ec = new EquipoController();
        int op = 0;
        do {
            System.out.println("***MENU***");
            System.out.println("1. ingresar jugadores");
            System.out.println("2. ingresar equipos");
            System.out.println("3. Asignar Jugadores a los equipos");
            System.out.println("4. Listar jugadores");
            System.out.println("5. Listar equipos");
            System.out.println("6. Salir");

            System.out.println("Seleccione la opción:");
            op = leer.nextInt();

            switch (op) {
                case 1:
                     jugadores = jc.fabricaJugadores();
                    break;

                case 2:
                    ec.fabricaEquipos();
                    break;

                case 3:
                    ec.cargarJugadores(jugadores);
                    break;

                case 4:
                    jc.mostrarJugadores();
                    break;

                case 5:
                    ec.mostrarEquipos();
                    break;

                case 6:
                    System.out.println("Gracias por utilizar la aplicación @juan");
                    break;
                default:
                    System.out.println("Error opcion");
                    break;

            }

        } while (op != 6);

       

        

        
        
        
        

    }

}
