/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Alumno;

/**
 *
 * @author ajuand
 */
public class AlumnoController {

    private Scanner leer;
    private ArrayList<Alumno> alumnos;
    private List<Integer> notas;

    public AlumnoController() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.alumnos = new ArrayList();

    }

    public Alumno crearAlumno() {
        this.notas = new ArrayList();
        System.out.println("Ingrese nombre del Alumno: ");
        String nombre = leer.next();
        System.out.println("Nota 1:");
        notas.add(leer.nextInt());
        System.out.println("Nota 2:");
        notas.add(leer.nextInt());

        System.out.println("Nota 3:");
        notas.add(leer.nextInt());
        return new Alumno(nombre, notas);
    }

    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    public void fabricaAlumnos() {
        String op = "s";
        do {
            Alumno ac = crearAlumno();
            agregarAlumno(ac);
            System.out.println("Desea continuar creando alumnos s/n");
            op = leer.next();
        } while (!op.equalsIgnoreCase("n"));

    }

    public void mostrarAlumnos() {
        System.out.println("Lista actual de alumnos es:");
        for (Alumno aux : alumnos) {
            System.out.println(aux.toString());

        }

    }

    public double bucarAlumno(String nombre) {
        boolean bandera = true;
        double notaF=0;
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno a = alumnos.get(i);
            if (a.getNombre().equals(nombre)) {

               notaF= notaFinal(i);
                bandera = false;
            }

        }

        if (bandera) {
            System.out.println("No se encuentra el alumno");
        }
        return notaF;
    }

    public double notaFinal(int x) {
//        for (int i = 0; i < alumnos.get(x).getNotas().size(); i++) {
//            
//        }

        int suma = 0;
        for (int nota : alumnos.get(x).getNotas()) {
            suma += nota;
        }
        return suma/ alumnos.get(x).getNotas().size();
    }

}
