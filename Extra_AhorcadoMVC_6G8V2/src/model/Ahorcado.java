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
    private String[] vector;
    private int cantidaEncontrada;
    private int cantidaMax;

    public Ahorcado(String[] vector, int cantidaEncontrada, int cantidaMax) {
        this.vector = vector;
        this.cantidaEncontrada = cantidaEncontrada;
        this.cantidaMax = cantidaMax;
    }

    public Ahorcado() {
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public int getCantidaEncontrada() {
        return cantidaEncontrada;
    }

    public void setCantidaEncontrada(int cantidaEncontrada) {
        this.cantidaEncontrada = cantidaEncontrada;
    }

    public int getCantidaMax() {
        return cantidaMax;
    }

    public void setCantidaMax(int cantidaMax) {
        this.cantidaMax = cantidaMax;
    }
    
    
    
    
    
}
