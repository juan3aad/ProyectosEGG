/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.logging.Logger;

/**
 *
 * @author ajuand
 */
public class Nif {
    private long dni;
    private char letra;

    public Nif(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public Nif() {
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
    
    
    
    
    
}
