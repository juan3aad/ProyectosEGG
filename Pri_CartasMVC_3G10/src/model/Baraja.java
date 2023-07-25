/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author ajuand
 */
public class Baraja {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> monton;
    

    public Baraja() {
        cartas= new ArrayList<>();
        monton= new ArrayList<>();
        inicializarBaraja();
    }
    
    public  void inicializarBaraja(){
        cartas.removeAll(cartas);
        String[] palos={"espadas","bastos","oros","copas"};
        int[] numeros={1,2,3,4,5,6,7,10,11,12};
        
        for(String palo:palos){
            for(int numero:numeros){
                cartas.add(new Carta(numero,palo));
            }
            
        }
        
    }
     //-------------------------------------
    public void barajar(){
        Collections.shuffle(cartas);
    }
    //-------------------------------------------
    public Carta siguienteCarta(){
        if(cartas.isEmpty()){
            System.out.println("No hay cartas en la baraja");
            return null;
        }
        Carta carta=cartas.remove(0);
        monton.add(carta);
        return carta;
    }
    //-------------------------------------------
    public int numeroDisponible(){
        return cartas.size();
    }
    //-------------------------------------------
    public ArrayList<Carta> darCartas(int cantidad){
        ArrayList<Carta> cartasDadas= new ArrayList<>();
        if(cantidad>cartas.size()){
            System.out.println("No hay suficientes cartas disponibles");
            return cartasDadas;
        }
        
        for (int i = 0; i < cantidad; i++) {
            Carta carta=siguienteCarta();
            cartasDadas.add(carta);
            
        }
        
        return cartasDadas;
    }
    //-------------------------------------
    public ArrayList<Carta> cartasMonton(){
        return monton;
    }
    //-------------------------
    public ArrayList<Carta>mostrarBaraja(){
        return cartas;
    } 
    

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }
    
    
    
    
    
    
    
}
