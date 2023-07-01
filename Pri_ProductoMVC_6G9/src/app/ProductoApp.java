/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.ProductoController;
import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class ProductoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean salir=false;
        int opcion;
        
        Scanner leer= new Scanner(System.in);
        ProductoController pro= new ProductoController();
        
        while (!salir){
            System.out.println("-----------MENU-------");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio de un producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción:");
            
            opcion= leer.nextInt();
            leer.nextLine();//Consumir un salto de linea despues de un número
            
            switch(opcion){
                case 1:
                    pro.fabricaProductos();
                    break;
                case 2: 
                    pro.modificarPrecioProducto();
                    break;
                    
                case 3:
                    pro.eliminarProducto();
                    break;
                    
                case 4:
                    pro.mostrarProductos();
                    break;
                case 5:
                    salir=true;
                    break;
                    
                default:
                    System.out.println("Opción invalida. Intente nuevamente");
                    break;
                    
            }
        }
        
        
        
        
    }
    
}
