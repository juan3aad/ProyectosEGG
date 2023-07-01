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
    private String nomEquipo;
    private ArrayList<Jugador> jugadores;
    
       

    public Equipo() {
        this.jugadores= new ArrayList();
    }
    
    

    public String getNomEquipo() {
        return nomEquipo;
    }

    public void setNomEquipo(String nomEquipo) {
        this.nomEquipo = nomEquipo;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    public void agregarJugador(Jugador ju){
        jugadores.add(ju);
    }

    @Override
    public String toString() {
        return "Equipo{" + "nomEquipo=" + nomEquipo + ", jugadores=" + jugadores + '}';
    }
 
    
}
