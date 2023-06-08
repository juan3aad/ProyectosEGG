/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introej1;
import java.util.Scanner;
/**
 *
 * @author tuvie
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("con esta clase guardamos valores ingresados por consola en la variable");
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        
        System.out.println("nombre "+nombre);
        System.out.println("edad "+ edad);
        
    }
    
}
