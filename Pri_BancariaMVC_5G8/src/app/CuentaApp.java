/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.CuentaController;

/**
 *
 * @author ajuand
 */
public class CuentaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaController cc= new CuentaController();
        cc.crearCuenta();
        
        System.out.println("Ingrese valor:");
        cc.consultarDatos();
        
        
    }
    
}
