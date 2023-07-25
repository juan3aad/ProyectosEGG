/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author ajuand
 */
public class RevolverDeAgua {
    private int posicionActual;
    private int posicionAgua;
    
    
    public void llenarRevolver(){
        Random random= new Random();
        posicionActual=random.nextInt(6);// genera numeros aleatorios del 0 a 5
        posicionAgua=random.nextInt(6);
        
    }
    
    public boolean mojar(){
        return posicionActual==posicionAgua;
    }
    
    public void siguienteChorro(){
        System.out.println("posicio+1"+(posicionActual+1));
        System.out.println("posici%6"+((posicionActual+1)%6));
        posicionActual=(posicionActual+1)%6;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
    
    
}
