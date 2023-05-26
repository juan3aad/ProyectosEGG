/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.OperacionController;
import model.Operacion;

/**
 *
 * @author ajuand
 */
public class OperacionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionController oc= new OperacionController();
        Operacion o=oc.crearOperacion();
        System.out.println("Suma: "+oc.sumar());
        System.out.println("Resta: "+oc.resta());
        System.out.println("Mutltiplicacion: "+oc.multiplicacion());
        System.out.println("División: "+oc.dividir());
        
        
    }
    
}
