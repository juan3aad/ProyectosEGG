/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.PeliculaController;
import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class PeliculaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        PeliculaController pc=new PeliculaController();
        pc.fabricaPeliculas();
        pc.mostrarPeliculas();
        pc.mostrarPeliculasMayores();
        System.out.println("---Mostrar peliculas de forma ascendente");
        pc.mostrarDuracionAsc();
        System.out.println("---Mostrar peliculas de forma Descendente");
        pc.mostrarDuracionDes();
        System.out.println("---Peliculas ordenadas por titulo alfabeticamente:");
        pc.mostrarTituloAlf();
        System.out.println("--.Peliculas ordenadas por director alfabeticamente");
        pc.mostrarDirectorAlf();
        
        
        
        
        
    }
    
}
