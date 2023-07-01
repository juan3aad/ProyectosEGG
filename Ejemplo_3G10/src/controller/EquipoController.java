/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Equipo;

/**
 *
 * @author ajuand
 */
public class EquipoController {
    
    private ArrayList<Equipo> equipos;

    public EquipoController() {
        this.equipos = new ArrayList<>();
    }
    
    public void agregarEquipo(Equipo equipo){
        equipos.add(equipo);
    }
    
    
    public Equipo buscarEquipoPorNombre(String nombre){
        for(Equipo equipo : equipos){
            if(equipo.getNombre().equalsIgnoreCase(nombre)){
                return equipo;
            
        }
        }
        return null;
    }
    
    public void mostrarEquipos(){
        for(Equipo equipo : equipos){
            System.out.println(equipo.toString());
        }
    }
    
    
    
}
