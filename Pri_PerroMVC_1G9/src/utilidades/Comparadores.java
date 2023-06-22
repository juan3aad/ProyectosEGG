/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Comparator;
import model.Perro;

/**
 *
 * @author ajuand
 */
public class Comparadores {
    public static Comparator<Perro> ordenarPorNombresDesc =new Comparator<Perro>(){
        @Override
        public int compare(Perro o1,Perro o2){
            return o1.getNombre().compareTo(o2.getNombre());
        };
       
    
};
    
     public static Comparator<Perro> ordenarPorNombresAsc =new Comparator<Perro>(){
        @Override
        public int compare(Perro o1,Perro o2){
            return o2.getNombre().compareTo(o1.getNombre());
        };
       
    
};
    
}