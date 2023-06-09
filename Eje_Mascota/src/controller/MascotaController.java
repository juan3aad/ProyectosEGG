/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import model.Mascota;

/**
 *
 * @author ajuand
 */
public class MascotaController {

    private Scanner leer;
    private ArrayList<Mascota> mascotas;

    public MascotaController() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }

    public Mascota crearMascota() {
        System.out.println("Introduccir nombre:");
        String nombre = leer.next();

        System.out.println("Introduccir apodo:");
        String apodo = leer.next();

        System.out.println("Introduccir tipo:");
        String tipo = leer.next();

        System.out.println("Introduccir edad:");
        Integer edad = leer.nextInt();

        return new Mascota(nombre, apodo, tipo,edad);

    }

    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }

    public void mostrarMascotas() {
        System.out.println("Lista actual de mascotas son: ");
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());

        }
        System.out.println("Cantidad= " + mascotas.size());
    }

    public void fabricaChiquitos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("Fer", "Chiquito", "Beagle",20));

        }

    }

    /**
     * Crear mascota pideindo los datos por teclado
     */
    public void fabricaMascotas(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Mascota mc = crearMascota();
            agregarMascota(mc);

            System.out.println(mc.toString());
        }
    }

    public void actualizarMascota1(int index) {

        if (index <= (mascotas.size() - 1)) {
            System.out.println("");
            System.out.println("-----------------------Actualizar 1--------------------------");
            Mascota m = mascotas.get(index);
            m.setApodo("Roberto");

        }
        else
        {
            System.out.println("El indice es erroneo para actualizar 1");
        }

    }

    public void actualizarMascota2(int index) {
        if (index<= (mascotas.size()-1)) {
            System.out.println("");
            System.out.println("---------------------Actualizar 2-----------------------------");
            Mascota m = crearMascota();
            mascotas.set(index, m);
            
        }else
        {
            System.out.println("El indice es erroneo para actualizar2");
        }
        
    }
    
    public void eliminarMascota(int index){
        
        if (index<=(mascotas.size()-1)) {
            mascotas.remove(index);
            
        }
        else
        {
            System.out.println("El indice es erroneo para eliminar");
        }
        
    }
    
    public void eliminarMascotaPorNombre(String nombre){
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m= mascotas.get(i);
            if(m.getNombre().equals(nombre)){
                mascotas.remove(m);
            }
            
        }
        
    }
    
    
    public void actualizarMascotaPorNombre(String nombreViejo, String nombreNuevo){
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m=mascotas.get(i);
            if(m.getNombre().equals(nombreViejo))
            {
                m.setNombre(nombreNuevo);
            }
            
        }
    }
    
}
