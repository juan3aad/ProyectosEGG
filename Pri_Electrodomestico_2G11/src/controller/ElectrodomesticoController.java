/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import model.Electrodomestico;

/**
 *
 * @author ajuand
 */
public class ElectrodomesticoController {
    Scanner leer = new Scanner(System.in);
    
    private Electrodomestico electro;
    //--------------------------------
    public ElectrodomesticoController() {
        this.electro = new Electrodomestico();
    }
    
    //------------------------------------------------
    public void comprobarConsumoEnergetico(char letra){
        int asciiValue = letra;
        if((asciiValue>=65 &&  asciiValue<=69) || (asciiValue>=97 &&  asciiValue<=101)){
            electro.setConsumoEnergetico(String.valueOf(letra).toUpperCase().charAt(0));
        }
        else{
            electro.setConsumoEnergetico('F');
        }
        
    }
    //----------------------------------------------------
      public void comprobarColor(String color){
        String var=color.toLowerCase();
        switch (var) {
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                electro.setColor(color);
            break;
            
            default:
                 electro.setColor("Blanco");
        }
    }
     //---------------------------------------------------
      public Electrodomestico crearElectrodomestico(){
        
        System.out.println("=====Ingresando Información=====");
        System.out.println("Ingrese el precio:");
        electro.setPrecio(electro.getPrecio()+leer.nextInt());
        
        System.out.println("Ingrese el color:");
        this.comprobarColor(leer.next());
        
        System.out.println("Ingrese consumo energetico:");
        this.comprobarConsumoEnergetico(leer.next().charAt(0));
        
        return electro;
        
        
        
    }
      //-------------------------------------------------------
      public void mostrarElectrodomestico(){
          System.out.println(electro.toString());
      }
     //--------------------------------------------------------
      public void precioFinal(){
          
      }
      
    
}
