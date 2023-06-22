/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.AlumnoController;
import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class AlumnoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        AlumnoController ac=new AlumnoController();
        ac.fabricaAlumnos();
        ac.mostrarAlumnos();
        System.out.println("Ingrese el nombre del alumno :");
        System.out.println("Nota final: "+ ac.bucarAlumno(leer.next()));
        
    }
    
}
