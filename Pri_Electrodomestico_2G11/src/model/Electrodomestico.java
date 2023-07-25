/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class Electrodomestico {
    Scanner leer = new Scanner(System.in);
    protected double precio;
    protected String color;
    protected  char consumoEnergetico;
    protected  double peso;
    

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico) {
        this.precio = 1000d;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }
    
    
    public void crearElectro(double precio, String color, char consumoEnergetico)
    {
       this.precio = 1000d;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + '}';
    }
    
    
}
