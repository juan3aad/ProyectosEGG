/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.JuegoController;
import controller.JugadorController;
import java.util.Scanner;
import model.Jugador;

/**
 *
 * @author ajuand
 */
public class PrincipalRuleta {
    private static Scanner leer= new Scanner(System.in);
    private static JugadorController jugadorController = new JugadorController();
    private static JuegoController juegoController  = new JuegoController();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int op;
        do {
            
            mostrarMenuPrincipal();
            op=leerOpcion();
            
            switch (op) {
                case 1:
                    agregarJugador();
                    break;
                case 2:
                    mostrarJugadores();
                    break;
                case 3:
                    llenarJuego();
                    break;
                    
                case 4:
                    mostrarJuego();
                    break;
                    
                case 5://Jugar Ronda
                    jugarRonda();
                    break;
                    
                default:
                    System.out.println("opcion no valida");
                    break;
            }
            
        } while (op!=6);
        
        leer.close();
        
        
        
    }
    
    private static void mostrarMenuPrincipal(){
        System.out.println("-----Juego de la ruleta rusa----");
        System.out.println("1. Agregar jugadores");
        System.out.println("2. Mostrar Jugadores");
        System.out.println("3. LLenar juego");
        System.out.println("4. Mostrar Juego");
        System.out.println("5. Jugar Ronda");
        System.out.println("6. Salir");
        System.out.println("----------------------------------------");
        System.out.println("Ingrese opción:");
        
    }
    //______________________________
    private static int leerOpcion(){
        try{ 
            return leer.nextInt();
        }   catch(Exception e){
            leer.nextLine();//limpiar el buffer del escaner
            return -1;
        }
    }
    //---------------------------------------------
    private static void agregarJugador()
    {
       if(jugadorController.numeroJugadores() >5)  {
           System.out.println("El máximo número de jugadores es 6. No se pueden agregar más.");
           return;
       }
        Jugador jugador= new Jugador();
        jugadorController.agregarJugador(jugador);
        System.out.println("Se adiciono un nuevo jugador");
        
    }
    //--------------------------------------------------------
    private static void mostrarJugadores(){
        jugadorController.mostrarJugadores();
        
    }
    //--------------------------------------------------
    private static void llenarJuego(){
        if(jugadorController.numeroJugadores()<=0){
            System.out.println("No hay jugadores favor adicione primero");
            return;
            
        }
        juegoController.llenarJuego(jugadorController.getJugadores());
        
        
    }
    
    //---------------------------------------------------------
    private static void mostrarJuego(){
        juegoController.mostrarJuego();
    }
    //----------------------------------------------------------
    private static void jugarRonda(){
        juegoController.ronda();
        System.out.println("La ronda ha sido jugada. ");
    }
    
    
    
}
