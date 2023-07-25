/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Persona;

/**
 *
 * @author ajuand
 */
public class PersonaController {
    private ArrayList <Persona> personas;
    
    public PersonaController(){
        this.personas= new ArrayList<>();
    }
    
    
    public void agregarPersona(Persona persona){
        personas.add(persona);
    }
    
    public Persona buscarPersonaPorNombre(String nombre){
        for(Persona persona: personas){
            if(persona.getNombre().equalsIgnoreCase(nombre)){
                return persona;
            }
        }
        return null;
    }
    
    public void mostrarPersonas(){
        for(Persona persona: personas){
            System.out.println(persona.toString());
        }
    }
    
    public void eliminarPersona(Persona persona){
        personas.remove(persona);
        
    }
    
    
}
