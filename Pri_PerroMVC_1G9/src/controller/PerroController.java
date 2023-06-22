/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import model.Perro;
import utilidades.Comparadores;

/**
 *
 * @author ajuand
 */
public class PerroController {

    private Scanner leer;
    private ArrayList<Perro> perros;

    public PerroController() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.perros = new ArrayList();
    }

    public Perro crearPerro() {

        System.out.println("Ingrese nombre del perro");
        String nombre = leer.next();
        System.out.println("Ingrese la raza del perro");
        String raza = leer.next();

        return new Perro(nombre, raza);

    }

    public void agregarPerro(Perro p) {
        perros.add(p);
    }

    public void fabricaPerros() {
        String op = "s";
        do {
            Perro pc = crearPerro();
            agregarPerro(pc);
            System.out.println("Desea continuar creando perros s/n");
            op = leer.next();
        } while (!op.equalsIgnoreCase("n"));

    }

    public void mostrarPerros() {
        System.out.println("Lista actual de perros es: ");
        for (Perro aux : perros) {
            System.out.println(aux.toString());

        }

        System.out.println("Cantidad Perros: " + perros.size());
    }

    public void eliminarPerrosPorNombre(String nombre) {
//        boolean bandera = true;
//
//        for (int i = 0; i < perros.size(); i++) {
//            Perro p = perros.get(i);
//            if (p.getNombre().equals(nombre)) {
//                //perros.remove(p);
//                perros.remove(i);
//                bandera = false;
//            }
//
//        }
//        if (bandera) {
//            System.out.println("No se encuentra coincidencias  para eliminar el nombre del perro");
//
//        }
//        Collections.sort(perros, Comparadores.ordenarPorNombresDesc);
    
      boolean bandera = true;
    Iterator<Perro> iter = perros.iterator();
    
    while (iter.hasNext()){
        Perro p = iter.next();
        
        if(p.getNombre().equals(nombre)){
            bandera = false;
            iter.remove();
        }
    }
    
     if (bandera) {
            System.out.println("No se encuentra coincidencias  para eliminar el nombre del perro");
        }
    
     Collections.sort(perros, Comparadores.ordenarPorNombresDesc);


    }

}
