/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import model.Producto;

/**
 *
 * @author ajuand
 */
public class ProductoController {
    private Scanner leer;
    private HashMap<String,Integer>productos;

    public ProductoController() {
        this.leer =new Scanner(System.in);
        this.productos = new HashMap();
    }
    
    public Producto crearProducto(){
        System.out.println("Ingrese Nombre producto:");
        String nombrePro= leer.next();
        System.out.println("Ingrese el precio del producto:");
        Integer precio= leer.nextInt();
        
        return new Producto(nombrePro,precio);
    }
   
    
    public void agregarProducto(Producto p){
        
        productos.put(p.getNombre(),p.getPrecio());
    }
    
    public void fabricaProductos(){
        String op="s";
        
        do{
            Producto pro=crearProducto();
            agregarProducto(pro);
            System.out.println("Desea continuar creando perros s/n");
            op=leer.next();
        }while(!op.equalsIgnoreCase("n"));
    }
    
    public void modificarPrecioProducto(){
        System.out.println("Ingrese el nombre del producto a modificar");
        String nombre= leer.nextLine();
        
        
        if(productos.containsKey(nombre)){
            System.out.println("Ingrese el nuevo precio del producto:");
            Integer precio = leer.nextInt();
            
            leer.nextLine();
            
            productos.put(nombre, precio);
            
            System.out.println("El precio del producto fue modificado con exito");
        }
        else
        {
            System.out.println("Producto no encontrado");
        }
        
        
    }
    
    public  void eliminarProducto(){
        System.out.println("Ingrese el nombre del prducto a eliminar:");
        String nombre= leer.nextLine();
        
        if(productos.containsKey(nombre)){
            productos.remove(nombre);
            System.out.println("Producto Eliminado con exito");
        } else
        {
            System.out.println("Producto no encontrado");
        }
    }
    
    public void mostrarProductos(){
        for(Map.Entry<String,Integer> aux : productos.entrySet()){
            String key=aux.getKey();
            Integer value= aux.getValue();
            
            System.out.println("Key "+ key + " value "+value);
        }
    }
    
}
