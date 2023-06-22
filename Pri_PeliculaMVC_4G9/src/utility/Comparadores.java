/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.Comparator;
import model.Pelicula;

/**
 *
 * @author ajuand
 */
public class Comparadores {
    public static Comparator<Pelicula> ordenarPorDuracionDesc= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1,Pelicula o2){
            return o2.getDuracion().compareTo(o1.getDuracion());
        };
    };
    
    public static Comparator<Pelicula> ordenarPorDuracionAsc= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1,Pelicula o2){
            return o1.getDuracion().compareTo(o2.getDuracion());
        };
    };
    
    public static Comparator<Pelicula> ordenarPorTituloAlf= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1,Pelicula o2){
            return o1.getTitulo().compareTo(o2.getTitulo());
        };
    };
    
    
    public static Comparator<Pelicula> ordenarPorDirectorAlf= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1,Pelicula o2){
            return o2.getDirector().compareTo(o1.getDirector());
        };
    };
    
 
    
    
    
}
