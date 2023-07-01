/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.EquipoController;
import controller.JugadorController;
import java.util.Scanner;
import model.Equipo;
import model.Jugador;

/**
 *
 * @author ajuand
 */
public class AppEje {

    

    /**
     * @param args the command line arguments
     * @return
     */
    
    

    
    public static  void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    JugadorController jugadorController = new JugadorController();
    EquipoController equipoController = new EquipoController();

        int op = 0;
        do {
            System.out.println("---MENU--");
            System.out.println("1. Ingresar Jugadores");
            System.out.println("2. Mostrar Jugadores");
            System.out.println("3. Ingresar equipos");
            System.out.println("4. Mostrar equipos");
            System.out.println("5. Buscar equipo para asignar jugadores");
            System.out.println("6. Eliminar Jugadores");
            System.out.println("7. Eliminar jugadores del equipo");
            System.out.println("8. salir");
            System.out.println("Seleccione una opción:");
            op = leer.nextInt();
            switch (op) {
                case 1://Ingresar Jugadores
                    System.out.println("=== Ingreso de Jugadores ===");
                    System.out.println("Ingrese nombre jug:");
                    String nombre = leer.next();

                    System.out.println("Ingrese apellido jug:");
                    String apellido = leer.next();

                    System.out.println("Ingrese Posición:");
                    String posicion = leer.next();

                    System.out.println("Ingrese Número:");
                    int numero = leer.nextInt();

                    Jugador jugador = new Jugador(nombre, apellido, posicion, numero);
                    jugadorController.agregarJugador(jugador);

                    break;

                case 2://Moistrar jugadores
                    jugadorController.mostrarJugadores();
                    break;

                case 3://Ingresar Equipos
                    System.out.println("\n=== Ingreso de Equipos ===");
                    System.out.println("Nombre Equipo:");
                    String nombreEquipo = leer.next();

                    Equipo equipo = new Equipo(nombreEquipo);
                    equipoController.agregarEquipo(equipo);
                    break;

                case 4://mostrar jugadores
                    System.out.println("\n=== Listado de Equipos ===");
                    equipoController.mostrarEquipos();

                    break;

                case 5://Asignar jugadores a los equipos
                    System.out.println("\n Ingrese el nombre del equipo a buscar: ");
                    String nombreEquipoBuscado = leer.next();
                    Equipo equipoEncontrado = equipoController.buscarEquipoPorNombre(nombreEquipoBuscado);

                    if (equipoEncontrado != null) {
                        //Buscar jugador y agregarlo al equipo
                        System.out.println("\n Ingrese el nombre del jugador");
                        String nombreJugadorBuscado = leer.next();
                        Jugador jugadorEncontrado = jugadorController.buscarJugadorPorNombre(nombreJugadorBuscado);

                        if (jugadorEncontrado != null) {

                            equipoEncontrado.agregarJugador(jugadorEncontrado);
                            System.out.println("!Jugador agregado exitosamente al equipo " + equipoEncontrado.getNombre());

                        } else {
                            System.out.println("Jugador no encontrado");
                        }

                    } else {
                        System.out.println("Equipo no encontrado");
                    }

                    break;
                case 6:
                    System.out.println("\n Ingrese el nombre del jugador a eliminar: ");
                       String nombreJugadorBuscado1 = leer.next();
                       Jugador jugadorEncontrado1=jugadorController.buscarJugadorPorNombre(nombreJugadorBuscado1);
                       
                    if(jugadorEncontrado1!=null){
                        jugadorController.eliminarJugador(jugadorEncontrado1);
                        System.out.println("!!Jugador Elinado con exito !!");
                    }
                    else
                    {
                        System.out.println("El jugador no se encuentra");
                    }
                    
                    break;
                case 7:
                    System.out.println("\n Ingrese el nombre del equipo a buscar: ");
                    String nombreEquipoBuscado1 = leer.next();
                    Equipo equipoEncontrado1 = equipoController.buscarEquipoPorNombre(nombreEquipoBuscado1);
                    
                    if (equipoEncontrado1 != null) {
                        //Buscar jugador y agregarlo al equipo
                        System.out.println("\n Ingrese el nombre del jugador a eliminar: ");
                        String nombreJugadorBuscado = leer.next();
                        Jugador jugadorEncontrado = jugadorController.buscarJugadorPorNombre(nombreJugadorBuscado);

                        if (jugadorEncontrado != null) {

                            equipoEncontrado1.eliminarJugador(jugadorEncontrado);
                            System.out.println("!Jugador eliminado exitosamente al equipo " + equipoEncontrado1.getNombre());

                        } else {
                            System.out.println("Jugador no encontrado");
                        }

                    } else {
                        System.out.println("Equipo no encontrado");
                    }
                    
                    

                    break;
                    
                case 8:
                    System.out.println("!Hasta luego!!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("opcion invalida");
                    break;
                    
            }

        } while (op != 8);

    }

    
    

}
