/*
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
 */
package ejercicioprincipal_guia7;

import java.util.Scanner;




/**
 *
 * @author ajuand
 */
public class Ejercicio10 {
    
    public static void main(String[] args){
        int num;
        Scanner leer= new Scanner(System.in);
        for(int i=1;i<=4;i++)
        {
            
            num=leer.nextInt();
            System.out.print(num);
            
            
            for(int j=0;j<num;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
            
    }
    
    
         
    
}
