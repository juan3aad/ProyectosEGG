/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import model.Electrodomestico;
import model.Lavadora;

/**
 *
 * @author ajuand
 */
public class LavadoraController {
    Scanner leer = new Scanner(System.in);
    private ElectrodomesticoController ec;
    private Lavadora lav;
    private Electrodomestico el;

    public LavadoraController() {
        this.ec= new ElectrodomesticoController();
        this.lav = new Lavadora();
        
    }
    
    //------------------------------------
    public void crearElectrodomestico(){
        
    }
     //------------------------------------
    public void crearLavadora(){
       
        System.out.println("Ingrese la carga");
        lav.setCarga(leer.next());
        
        
    }
    //------------------------------------
    public void mostrarLavadora(){
        System.out.println(lav.toString()+ec);
    }
     //------------------------------------
    public void precioFinal(){
        
    }
    
}
