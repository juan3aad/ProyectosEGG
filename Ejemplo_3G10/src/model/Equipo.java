/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ajuand
 */
public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores= new ArrayList<>();
    }
    
    
    /**
     * 
     * Getter and Setter
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    /**
     * Otros metodos
     */
    
    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador){
        jugadores.remove(jugador);
    }
    
    
    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", jugadores=" + jugadores + '}';
    }
    
   
    
    
}
