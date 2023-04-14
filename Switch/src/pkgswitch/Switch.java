/*
 SWITCH
El bloque switch evalúa qué valor tiene la variable, y de acuerdo con el valor que posee ejecuta
las sentencias del bloque case correspondiente, es decir, del bloque case que cumpla con el valor
de la variable que se está evaluando dentro del switch.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        byte op;
        
        System.out.println("Ingrese un número para el tipo de motor [1-4]");
        op=leer.nextByte();
                

        switch (op) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;

            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;

            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;

            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");        
        }
    }

}
