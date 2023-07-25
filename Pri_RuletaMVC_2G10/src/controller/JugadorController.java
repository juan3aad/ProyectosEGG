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
    
    private ArrayList<Jugador>jugadores;

    public JugadorController() {
        this.jugadores = new ArrayList<>();
    }
    
    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
        
        
    }
    
    public int numeroJugadores(){
        return jugadores.size();
    }
    
    public void mostrarJugadores(){
        
        for(Jugador jugador : jugadores){
            System.out.println(jugador.toString());
        }
            
        
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
    
}
