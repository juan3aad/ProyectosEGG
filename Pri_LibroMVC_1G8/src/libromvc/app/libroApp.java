/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libromvc.app;

import java.util.Scanner;
import libromvc.controller.LibroController;
import libromvc.model.Libro;

/**
 *
 * @author ajuand
 */
public class libroApp {
    
    public  static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        Libro libro = new Libro();
        LibroController libroController = new LibroController(libro);
        
        System.out.println("Ingrese isbn: ");
        String isbn=leer.next();
        
        System.out.println("Ingrese el titulo: ");
        String titulo=leer.next();
        
        System.out.println("Ingrese el autor: ");
        String autor=leer.next();
        
        System.out.println("Ingrese el numero de paginas");
        String numpag=leer.next() ;
        
        libroController.cargaLibro(isbn, titulo, autor, numpag);
        
        libroController.mostrarLibro();
        
    }
    
}
