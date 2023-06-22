/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class DoWhile {

   
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
         int cont=1,suma=0;
        do {
            System.out.println("ingrese sus numeros");
           int num = leer.nextInt();
           if (num > 0) {
               suma+=num;
           }
           if (num == 0){
               break;
           }
            cont++;  
            
    }while(cont != 20);
        System.out.println("la suma de los números es "+ suma);
                
                
    }
    
}
