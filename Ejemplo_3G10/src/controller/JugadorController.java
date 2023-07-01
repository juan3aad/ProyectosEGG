/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Jugador;

/**
 *
 * @author ajuand
 */
public class JugadorController {

    private ArrayList<Jugador> jugadores;

    public JugadorController() {
        this.jugadores=new ArrayList<>();
    }
    
    

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
    
    
    
    public Jugador buscarJugadorPorNombre(String nombre){
        for(Jugador jugador : jugadores){
            if(jugador.getNombre().equalsIgnoreCase(nombre)){
                return jugador;
            }
        }
        return null;
    }
    
    public void mostrarJugadores(){
        for(Jugador jugador:jugadores){
            System.out.println(jugador.toString()); 
        }
    }
    
    public void eliminarJugador(Jugador jugador){
        jugadores.remove(jugador);
    }
    

}
