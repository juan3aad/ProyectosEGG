/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import model.Pais;

/**
 *
 * @author ajuand
 */
public class PaisController {
    
    private Scanner leer;
    //private Set<Pais> paises;
    private TreeSet<Pais> paises;

    public PaisController() {
        this.leer= new Scanner(System.in).useDelimiter("\n");
        //this.paises= new HashSet();
        this.paises= new TreeSet();
        
        
    }
    
    public Pais crearPais(){
        System.out.println("Ingrese el nombre del pais:");
        String nameCountry= leer.next();
        
        return new Pais(nameCountry);
    }
    
    
    public void agregarPais(Pais p){
        paises.add(p);
    }
    
    
    public void fabricaPaises(){
        String op="s";
        do{
            Pais ps= crearPais();
            agregarPais(ps);
            System.out.println("Desea continuar ingresando paises s/n:");
            op=leer.next();
            
        }while(!op.equalsIgnoreCase("n"));
        
        
    }
    
    public void mostrarPaises(){
        System.out.println("Listado de Paises");
        for (Pais aux:paises) {
            System.out.println(aux.toString());
            
        }
        System.out.println("Cantidad de paises: "+paises.size());
    }
    
    public void eliminarPais(String pais){
        boolean bandera=true;
        //Obtener un iterator para el conjunto
        Iterator<Pais> iter = paises.iterator();
        
        while (iter.hasNext()){
            Pais p= iter.next();
            
            if(p.getNomPais().equals(pais)){
                bandera=false;
                iter.remove();
            }
        }
        if(bandera){
            System.out.println("No se encuentra el pais a eliminar");
        }
        
    }
    
    
}
