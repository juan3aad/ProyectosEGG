/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferenciamvc.app;

import circunferenciamvc.controller.CircunferenciaController;
import circunferenciamvc.model.Circunferencia;

/**
 *
 * @author ajuand
 */
public class CircunferenciaApp {
    
    public static void main(String[] args){
        Circunferencia c= new Circunferencia(20);
        CircunferenciaController cc = new CircunferenciaController(c);
        
        cc.crearCircunferencia();
        cc.area();
        cc.perimetro();
        
        
        
        
    }
    
}
