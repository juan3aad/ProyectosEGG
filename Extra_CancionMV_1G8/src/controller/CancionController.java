/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import model.Cancion;

/**
 *
 * @author ajuand
 */
public class CancionController {

    private Cancion cancion;
    
    Scanner leer = new Scanner(System.in);
    
    public CancionController() {
    }
    
    public CancionController(Cancion cancion) {
        this.cancion = cancion;
    }
    
    public void crearCancion() {
        System.out.println("Titulo");
        this.cancion.setTitulo(leer.nextLine());
        
        System.out.println("Autor");
        this.cancion.setAutor(leer.nextLine());
        
    }
    
    public void mostrar() {
        System.out.println(this.cancion.toString());
    }
    
}
