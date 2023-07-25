/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Baraja;
import model.Carta;

/**
 *
 * @author ajuand
 */
public class BarajaController {
    private Baraja baraja;

    public BarajaController() {
        baraja= new Baraja();
    }
     //-----------------------
    public void barajar(){
        baraja.barajar();
    }
    
    public void reiniciarJuego(){
        baraja.inicializarBaraja();
    }
    
  
    
    public Carta mostrarSiguienteCarta(){
        return baraja.siguienteCarta();
        
    }
    public int numeroCartasDisponible(){
        return baraja.numeroDisponible();
    }
    //--------------------------------------------------
    public ArrayList<Carta> entregaDarcartas(int cantidad){
         ArrayList<Carta> cartaDadas = new ArrayList<>();
        cartaDadas=baraja.darCartas(cantidad);
        return cartaDadas;
        
    }
    //--------------------------------------------------
    public ArrayList<Carta>mostrarMonton(){
        return baraja.cartasMonton();
    }
    //--------------------------------------------------
    public ArrayList<Carta> mostrarBaraja(){
        return baraja.mostrarBaraja();
        
    }
    
    
    
    
    
}
