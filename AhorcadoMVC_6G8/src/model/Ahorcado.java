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
public class Ahorcado {
    
    private char [] vectorPalabra;
    private int cantLetrasFind;
    private int cantMaxJugadas;

    public Ahorcado(char[] vectorPalabra, int cantLetrasFind, int cantMaxJugadas) {
        this.vectorPalabra = vectorPalabra;
        this.cantLetrasFind = cantLetrasFind;
        this.cantMaxJugadas = cantMaxJugadas;
    }

    public Ahorcado() {
    }

    public char[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(char[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

   

    public int getCantLetrasFind() {
        return cantLetrasFind;
    }

    public void setCantLetrasFind(int cantLetrasFind) {
        this.cantLetrasFind = cantLetrasFind;
    }

    public int getCantMaxJugadas() {
        return cantMaxJugadas;
    }

    public void setCantMaxJugadas(int cantMaxJugadas) {
        this.cantMaxJugadas = cantMaxJugadas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "vectorPalabra=" + vectorPalabra + ", cantLetrasFind=" + cantLetrasFind + ", cantMaxJugadas=" + cantMaxJugadas + '}';
    }
    
    
    
    
    
}
