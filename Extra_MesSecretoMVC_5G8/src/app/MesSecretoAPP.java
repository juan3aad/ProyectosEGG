/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.MesSecretoController;
import java.util.Scanner;
import model.MesSecreto;

/**
 *
 * @author ajuand
 */
public class MesSecretoAPP {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        MesSecreto ms= new MesSecreto();
        MesSecretoController msc= new MesSecretoController();
        boolean bandera=false;
        do
        {
            System.out.println("Ingrese el mes adivinar");
            
            bandera=msc.adivine(ms, leer.next());
            if(bandera){
                System.out.println("Adivino el mes");
            }
            else
            {
                System.out.println("Vuelva a intentar");
            }
           
        }while (!bandera);
        
        
        
        
        
        
    }
    
}
