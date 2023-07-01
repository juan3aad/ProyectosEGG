/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import model.Equipo;
import model.Jugador;

/**
 *
 * @author ajuand
 */
public class EquipoController {

    private Scanner leer;
    private ArrayList<Equipo> equipos;

    

    public EquipoController() {

        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.equipos = new ArrayList();
     
        
    }

    public Equipo crearEquipo() {
        System.out.println("Ingrese el nombre del equipo:");
        String nomEquip = leer.next();
        Equipo eq1 = new Equipo();
        eq1.setNomEquipo(nomEquip);
        return eq1;

    }

    public void agregarEquipo(Equipo e) {
        equipos.add(e);
    }
    
    

    public void fabricaEquipos() {
        String op = "s";
        do {
            Equipo ec = crearEquipo();
            agregarEquipo(ec);
            System.out.println("desea continuar creando equipos s/n");
            op = leer.next();
        } while (!op.equalsIgnoreCase("n"));
    }

    public void mostrarEquipos() {
        System.out.println("Lista actual de equipos:  ");
        for (Equipo aux : equipos) {
            System.out.println(aux.toString());
        }

        System.out.println("Cantidad de equipos: " + equipos.size());
    }

    public void cargarJugadores(ArrayList<Jugador> jugadores) {
        System.out.println("*******EQUIPOS****************");
        mostrarEquipos();
        System.out.println("Seleccione un equipo:");
        String nomEquipo = leer.next();
        boolean bandera = true;
        boolean banderaJu = true;

        Iterator<Equipo> iter = equipos.iterator();
        while (iter.hasNext()) {
            Equipo e = iter.next();

            if (e.getNomEquipo().equals(nomEquipo)) {
                bandera = false;

                System.out.println("Ingrese el nombre del jugador asignar:");
                String nomAux = leer.next();

                Iterator<Jugador> iterJug = jugadores.iterator();
                while (iterJug.hasNext()) {
                    Jugador j = iterJug.next();

                    if (j.getNombre().equals(nomAux)) {
                        banderaJu = false;
                        e.agregarJugador(j);
                    }
                }
                
//                for(Jugador aux : jugadores){
//                    if (aux.getNombre().equals(nomAux)) {
//                        banderaJu = false;
//                        //e.getJugadores().add(0, aux));
//                       e.setJugadores((e.getJugadores().add(aux)));
//                    }
//                    
//                }
//                
                
                
                
                

                if (banderaJu) {
                    System.out.println("!!!Jugador no existe");
                }

            }
        }

        if (bandera) {
            System.out.println("No se encuentra el equipo ingresado");
        }

    }

}
