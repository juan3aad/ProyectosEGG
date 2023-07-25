/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;

/**
 *
 * @author ajuand
 */
public class PrincipalApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal perro1 = new Perro("Stich","Carne", 15, "Doberman");
        perro1.alimentarse();
        
        Animal gato1 = new Gato(true, "todos","Pescado", 15, "arequipa");
        gato1.alimentarse();
        
        Animal caballo1 = new Caballo("Alto","Fino", 35, "Doberman");
        caballo1.alimentarse();
        
    }
    
}
