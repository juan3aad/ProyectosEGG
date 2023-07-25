/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ajuand
 */
public class Electrodomestico {

    Scanner leer = new Scanner(System.in);
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    //constructir vacio
    public Electrodomestico() {
        this.precio = 1000d;
        this.color = "blanco";
        consumoEnergetico = 'F';
        peso = 0;
    }

    //constructor con todos los parametros
    public Electrodomestico(double precio, String color, char consumoEnergetico) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

    //metodos getter y setter
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Metodos para comprobarConsumoenergetico
    private void comprobarConsumoEnergetico(char letra) {
        int asciiValue = letra;
        if ((asciiValue >= 65 && asciiValue <= 69) || (asciiValue >= 97 && asciiValue <= 101)) {
            this.setConsumoEnergetico(String.valueOf(letra).toUpperCase().charAt(0));

        } else {
            this.setConsumoEnergetico('F');
        }
    }

    //Metodos para comprobarColor
    private void comprobarColor(String color) {
        String var = color.toLowerCase();
        switch (var) {
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                this.setColor(var);
                break;

            default:
                this.setColor("blanco");

        }

    }

    //Metodo crearElectrodomestico
    public void crearElectrodomestico() {
        System.out.println("========Ingresando información========");
        System.out.println("Ingrese el precio:");
        this.setPrecio(this.getPrecio() + leer.nextInt());

        System.out.println("Ingrese el color:");
        this.comprobarColor(leer.next());

        System.out.println("Ingrese el consumo energetico:");
        this.comprobarConsumoEnergetico(leer.next().charAt(0));

        System.out.println("Ingrese el peso:");
        this.setPeso(leer.nextDouble());
    }

    //Metodo precio final
    public double precioFinal() {

        double precioA = 0;
        double precioFin=this.getPrecio();
        switch (this.getConsumoEnergetico()) {
            case 'A':
                precioA = 1000d;
                break;

            case 'B':
                precioA = 800d;
                break;
                
            case 'C':
                precioA = 600d;
                break;

            case 'D':
                precioA = 500d;
                break;
                
            case 'E':
                precioA = 300d;
                break;
                
            case 'F':
                precioA = 100d;
                break;

        }
        
        precioFin=precioFin+precioA;
        
        if(this.peso>=1 && this.peso<=19){
            precioA=100d;
        }else if(this.peso>=20 && this.peso<=49){
            precioA=500d;
        }else if(this.peso>=50 && this.peso<=79){
            precioA=800d;
        }else if(this.peso>=80)
        {
            precioA=1000d;
        }
            
        precioFin=precioFin+precioA;
        return precioFin;
        
        
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    
    

}
