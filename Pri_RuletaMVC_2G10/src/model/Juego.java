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
public class Juego {

    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public Juego() {
        this.jugadores = new ArrayList<>();
        this.revolver = new RevolverDeAgua();
    }

    public void llenarJuego(ArrayList<Jugador> jugadores) {

        if (jugadores.size() > 6) {
            System.out.println("Número maximo de jugadores es 6. Se utilizaran los primeros 6 jugadores.");
            this.jugadores.addAll(jugadores.subList(0, 6));
        } else {
            this.jugadores.addAll(jugadores);
        }
        revolver.llenarRevolver();

    }

    public void ronda() {
        boolean alguienSeMojo = false;
        for (Jugador jugador : jugadores) {
            alguienSeMojo=jugador.disparo(revolver);
            
            if(alguienSeMojo){
                System.out.println("!El jugador " + jugador.getNombre() + "se ha mojado");
                break;
            }

        }
        
        if(!alguienSeMojo){
            System.out.println("¡Nadie se ha mojado en esta ronda!");
        }
        

    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
    
    

}
