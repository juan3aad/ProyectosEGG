/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Jugador;

/**
 *
 * @author ajuand
 */
public class JugadorController {
    private Scanner leer;
    private ArrayList<Jugador> jugadores;

    public JugadorController() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.jugadores= new ArrayList();
    }
    
    public Jugador crearJugador(){
        System.out.println("Ingrese el nombre: ");
        String nombreJug= leer.next();
        System.out.println("Ingrese el apellido: ");
        String apellidoJug= leer.next();
        System.out.println("Ingrese la posicion: ");
        String posicion=leer.next();
        System.out.println("Ingrese el numero: ");
        int numero= leer.nextInt();
         return new Jugador(nombreJug,apellidoJug,posicion,numero);
        
    }
    
    public ArrayList<Jugador> agregarJugador(Jugador j){
        jugadores.add(j);
        return jugadores;
        
    }
    
    public ArrayList<Jugador> fabricaJugadores(){
        ArrayList<Jugador> temp;
        String op="s";
        
        do{
            Jugador jc= crearJugador();
            temp=agregarJugador(jc);
            System.out.println("Desea continuar ingresando Jugadores s/n");
            
            op=leer.next();
            
        }while(!op.equalsIgnoreCase("n"));
        return temp;
    }
    
    public void mostrarJugadores(){
        System.out.println("La lista actual de jugadores es:");
        for(Jugador aux: jugadores){
            System.out.println(aux.toString());
        }
        
    }
    
    
    
    
}
