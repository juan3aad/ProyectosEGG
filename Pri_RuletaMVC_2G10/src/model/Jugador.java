/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ajuand
 */
public class Jugador {
    private static int contadorJugadores=0;
    
    
    private int id;
    private String nombre;
    private boolean mojado;

    public static int getContadorJugadores() {
        return contadorJugadores;
    }

    public static void setContadorJugadores(int contadorJugadores) {
        Jugador.contadorJugadores = contadorJugadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    
    
    public Jugador(){
        contadorJugadores++;
        id=contadorJugadores;
        nombre="jugador "+id;
        mojado=false;
        
    }
    
    public boolean disparo(RevolverDeAgua revolver){
        if(revolver.mojar()){
            mojado=true;
            return true;
        }
        else
        {
            revolver.siguienteChorro();
            return false;
        }
        
    }
    
    public boolean estaMojado(){
        return mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
    
}
