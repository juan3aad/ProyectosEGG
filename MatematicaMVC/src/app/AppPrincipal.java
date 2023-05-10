/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.MatematicaController;
import model.Matematica;

/**
 *
 * @author ajuand
 */
public class AppPrincipal {
    
    
    public static void main(String[] args){
        
        Matematica m = new Matematica();
        MatematicaController mc= new MatematicaController();
        
        System.out.println("El mayor es:   "+mc.devolverMayor(m));
        System.out.println("La potencia de los dos nuemeros es " + mc.calcularPotencia(m));
        System.out.println("Calcular la raiz del menor valor :"+ mc.calculaRaiz(m));
        
    }
    
    
}
