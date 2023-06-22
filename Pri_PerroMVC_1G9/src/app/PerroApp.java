/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.PerroController;
import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class PerroApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        PerroController pc= new PerroController();
        pc.fabricaPerros();
        pc.mostrarPerros();
        System.out.println("Ingres el nombre del perro a eliminar: ");
        pc.eliminarPerrosPorNombre(leer.next());
        pc.mostrarPerros();
    }
    
}
