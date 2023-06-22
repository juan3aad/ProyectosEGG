/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libromvc.controller;

import libromvc.model.Libro;

/**
 *
 * @author ajuand
 */
public class LibroController {
    private Libro libro;

    public LibroController(Libro libro) {
        this.libro = libro;
    }
    
    public void cargaLibro(String isbn,String titulo, String autor, String numpag){
        this.libro.setIsbn(isbn);
        this.libro.setTitulo(titulo);
        this.libro.setAutor(autor);
        this.libro.setNumPag(numpag);
        
    }
    
    public void mostrarLibro(){
        System.out.println(this.libro.toString());
    }
            
   
    
}
