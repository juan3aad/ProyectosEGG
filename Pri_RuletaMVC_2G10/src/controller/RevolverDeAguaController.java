/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.RevolverDeAgua;

/**
 *
 * @author ajuand
 */
public class RevolverDeAguaController {
    private RevolverDeAgua revolver;

    //--------------------------------------------------
    public RevolverDeAguaController() {
        revolver= new RevolverDeAgua();
    }
    //--------------------------------------------------
    public void llenarRevolver(){
        revolver.llenarRevolver();
    }
    //--------------------------------------------------
    public boolean mojar(){
        return revolver.mojar();
    }
    //--------------------------------------------------
    
    public void siguienteChorro(){
        revolver.siguienteChorro();
    }
    //--------------------------------------------
    public String obtenerEstadoRevolver(){
        return revolver.toString();
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

   
    
    
    
    
}
