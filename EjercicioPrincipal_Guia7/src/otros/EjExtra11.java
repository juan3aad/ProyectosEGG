
import java.util.Scanner;

public class EjExtra11 {

    public static void main(String[] args) {

        int op=0, resultado = 0, num1, num2;
        String op2 = "n";
        
        
        Scanner leer = new Scanner(System.in);
            
            
            
        do {
            op2="n";
            System.out.println("Ingrese número 1: ");
            num1 = leer.nextInt();
            System.out.println("Ingrese número 2: ");
            num2 = leer.nextInt();
            
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción.");
            op = leer.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                case 5:
                    System.out.println("¿Está\n seguro que desea salir del programa (S/N)?");
                    op2 = leer.next();
                    
                    
                    
                    break;
                default:
                    System.out.println("La opción ingresada no existe.");
                    break;
            }
            
            
        } while (op2.charAt(0)=='n');

    }
}