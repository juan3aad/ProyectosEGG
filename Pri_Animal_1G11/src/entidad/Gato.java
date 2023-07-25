/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author ajuand
 */
public class Gato extends Animal {
    private boolean garra;
    

    public Gato(boolean garra,  String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.garra = garra;
      
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
    
    
}
