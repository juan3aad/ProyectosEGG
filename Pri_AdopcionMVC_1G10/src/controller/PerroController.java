/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Perro;

/**
 *
 * @author ajuand
 */
public class PerroController {
    
    private ArrayList<Perro> perros;
    
    public  PerroController(){
        this.perros= new ArrayList<>();
    }
    
    public void agregarPerro(Perro perro){
        perros.add(perro);
    }
    
    public Perro buscarPerroPorNombre(String nombre){
        for(Perro perro:perros){
            if(perro.getNombre().equalsIgnoreCase(nombre)){
                return perro;
            }
        }
        return null;
    }
    
    public void mostrarPerros(){
        for(Perro perro: perros){
            System.out.println(perro.toString());
        }
    }
    
    public void eliminarPerro(Perro perro){
        perros.remove(perro);
    }
            
    
    
}
