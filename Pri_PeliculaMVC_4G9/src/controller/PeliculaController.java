/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import model.Pelicula;
import utility.Comparadores;

/**
 *
 * @author ajuand
 */
public class PeliculaController {
    
    private Scanner leer;
    private ArrayList<Pelicula> peliculas;

    public PeliculaController() {
        this.leer= new Scanner(System.in).useDelimiter("\n");
        this.peliculas= new ArrayList();
        
    }
    
    public Pelicula crearPelicula(){
        System.out.println("Ingrese el titulo de la pelicula:");
        String titulo= leer.next();
        
        System.out.println("Ingrese el nombre del director:");
        String director= leer.next();
        
        System.out.println("Ingrese la duración de la pelicula:");
        Integer duracion= leer.nextInt();
        
        return new Pelicula(titulo,director,duracion);
        
    }
    
    public void agregarPelicula(Pelicula p){
        peliculas.add(p);
    }
    
    public void fabricaPeliculas(){
        String op = "s";
        do{
            Pelicula pc= crearPelicula();
            agregarPelicula(pc);
            System.out.println("Desea continuar creando peliculas s/n:");
            op= leer.next();
        }while(!op.equalsIgnoreCase("n"));
        
    }
    
    public void mostrarPeliculas(){
        System.out.println("Lista actual de peliculas es: ");
        for (Pelicula aux: peliculas) {
            System.out.println(aux.toString());
            
        }
    }
    
    public void mostrarPeliculasMayores(){
        System.out.println("Peliculas que duran mas de 1 hora:");
        for (Pelicula aux: peliculas) {
            if(aux.getDuracion()>1){
                System.out.println(aux.toString());
            }
                        
        }
    }
    
    public void mostrarDuracionDes(){
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionDesc);
        this.mostrarPeliculas();
    }
    
    public void mostrarDuracionAsc(){
        Collections.sort(peliculas,Comparadores.ordenarPorDuracionAsc);
        this.mostrarPeliculas();
    }
    
    
    public void mostrarTituloAlf(){
        Collections.sort(peliculas,Comparadores.ordenarPorTituloAlf);
        this.mostrarPeliculas();
    }
    
    
    public void mostrarDirectorAlf(){
        Collections.sort(peliculas,Comparadores.ordenarPorDirectorAlf);
        this.mostrarPeliculas();
    }
    
    
    
}
