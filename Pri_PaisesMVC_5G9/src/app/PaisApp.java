/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.PaisController;
import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class PaisApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        PaisController pc= new PaisController();
        pc.fabricaPaises();
        pc.mostrarPaises();
        
        System.out.println("Ingrese el nombre del pais  a eliminar:");
        pc.eliminarPais(leer.next());
        pc.mostrarPaises();
        
        
    }
    
}
