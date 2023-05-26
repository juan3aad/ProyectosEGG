/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for2;

import java.util.Scanner;



/**
 *
 * @author ajuand
 */
public class For2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0,t;
        int num;
        String cadena="";
        for(i=1;i<=4;i++)
        {
            System.out.println("Ingrese el número " + i + ":");
            Scanner leer= new Scanner(System.in);
            num=leer.nextInt();
            cadena=String.valueOf(num);
            for(t=0;t<num;t++)
            {
                cadena=cadena + "*";
            }
            
            System.out.println(cadena);
            
        }
    }
    
}
