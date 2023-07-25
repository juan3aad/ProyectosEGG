/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.ElectrodomesticoController;
import controller.LavadoraController;
import model.Lavadora;

/**
 *
 * @author ajuand
 */
public class principalApp {
    
    ElectrodomesticoController electroController = new ElectrodomesticoController();
    static LavadoraController lavaController= new LavadoraController();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lavaController.crearLavadora();
        lavaController.mostrarLavadora();
        
        
        
    }
    
}
