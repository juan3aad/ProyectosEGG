/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Juego;
import model.Jugador;
import model.RevolverDeAgua;

/**
 *
 * @author ajuand
 */
public class JuegoController {
    private Juego  juego;
    private RevolverDeAguaController revolverDeAguaController;

    public JuegoController() {
        juego= new Juego();
        revolverDeAguaController= new RevolverDeAguaController();
    }
    
    public void llenarJuego(ArrayList<Jugador> jugadores){
        juego.llenarJuego(jugadores);
        
    }
    
    public void ronda(){
        juego.ronda();
    }
    
    public void mostrarJuego(){
        System.out.println(juego.toString());
        
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public RevolverDeAguaController getRevolverDeAguaController() {
        return revolverDeAguaController;
    }

    public void setRevolverDeAguaController(RevolverDeAguaController revolverDeAguaController) {
        this.revolverDeAguaController = revolverDeAguaController;
    }
    
    
    
    
    
    
}
