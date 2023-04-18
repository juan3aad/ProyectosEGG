/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionejer;

import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class FuncionEjer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        String cadena;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cadena");
        cadena = leer.nextLine();
        
        System.out.println(nuevaCadena(cadena));

    }

    public static String nuevaCadena(String palabra) {

        String nuevaCadena = "";

        //nuevaCadena = palabra.split(" ");
        nuevaCadena = palabra.replace('a', '@');
        nuevaCadena = nuevaCadena.replace('e', '#');
        nuevaCadena = nuevaCadena.replace('E', '#');
        nuevaCadena = nuevaCadena.replace('i', '$');
        nuevaCadena = nuevaCadena.replace('i', '$');
        nuevaCadena = nuevaCadena.replace('o', '%');
        nuevaCadena = nuevaCadena.replace('O', '%');
        nuevaCadena = nuevaCadena.replace('u', '*');
        nuevaCadena = nuevaCadena.replace('U', '*');

        return nuevaCadena;
    }

}
