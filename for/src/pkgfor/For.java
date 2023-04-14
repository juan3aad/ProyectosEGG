/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       byte num1=0,num2=0,num3=0,num4=0;
       do{
        System.out.println("Ingrese un numero JUAN entre 1 y 20");
         num1= leer.nextByte();
    }while((num1<1) && (num1>20));
       do{
           System.out.println("Ingrese un numero entre 1 y 20");
         num2= leer.nextByte();
       }while((num2<1) && (num2>20));
       do{
           System.out.println("Ingrese un numero entre 1 y 20");
         num3= leer.nextByte();
       }while((num3<1) && (num3>20));
       do{
           System.out.println("Ingrese un numero entre 1 y 20");
         num4= leer.nextByte();
       }while((num4<1) && (num4>20));
       
       for(byte i=0;i < num1;i++){
        System.out.print("*");
    }
        System.out.println("");
        for(byte i=0;i < num2;i++){
        System.out.print("*");
    }
        System.out.println("");
        for(byte i=0;i < num3;i++){
        System.out.print("*");
    }
        System.out.println("");
        for(byte i=0;i < num4;i++){
        System.out.print("*");
    }
        System.out.println("");
}
}