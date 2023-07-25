/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.Scanner;
import model.Electrodomestico;
import model.Lavadora;
import model.Televisor;

/**
 *
 * @author ajuand
 */
public class Pri_Electrodomestico_2VG11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        
        
        int op=0;
        
        Scanner leer1= new Scanner(System.in);
        
        do {
            op=0;
            System.out.println("1. Crear Lavadora");
            System.out.println("2.Crear Televisor");
            System.out.println("3. Mostrar ");
            System.out.println("4. Salir ");
            
            op= leer1.nextInt();
            
            switch (op) {
                case 1:
                    Lavadora lav= new Lavadora();
                    lav.crearLavadora();
                    electrodomesticos.add(lav);
                    
                    break;
                case 2:
                    Televisor tel = new Televisor();
                    tel.crearTelevisor();
                    electrodomesticos.add(tel);
                    break;
                    
                case 3:
                    double precioTotal=0;
                    for(Electrodomestico electro : electrodomesticos){
                        System.out.println(electro.toString());
                        System.out.println(electro.precioFinal());
                        precioTotal+=electro.precioFinal();
                    }
                    System.out.println("El total es: "+precioTotal);
                    
                default:
                    System.out.println("Gracias a todos");
            }
            
            
            
            
        } while (op!=4);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
