/*
WHILE
La estructura while ejecuta un bloque de instrucciones mientras se cumple una condición. La
condición se comprueba antes de empezar a ejecutar por primera vez el bucle, por lo tanto, si la
condición se evalúa a «false» en la primera iteración, entonces el bloque de instrucciones no se
ejecutará ninguna vez.
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        byte nota=-1;
                
        while(nota<0 || nota>10)
        {
            
            System.out.println("Ingrese la nota:");
            nota=leer.nextByte();
        }
        
    }
    
}
