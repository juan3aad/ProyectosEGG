/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_1g10;

import java.util.ArrayList;

/**
 *
 * @author ajuand
 */
public class Principal {
    
    public static void main(String[] args){
        Profesor profesor= new Profesor();
        profesor.setNombre("Agustin");
        profesor.setApellido("Lima");
        Curso curso= new Curso();
        curso.setProfesor(profesor);
        
        
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Mariela");
        alumno1.setApellido("Gadea");
        
        Alumno alumno2 = new Alumno();
        alumno2.setNombre("Jose");
        alumno2.setApellido("Gomez");
        
        ArrayList<Alumno> alumnos = new ArrayList();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        
        curso.setAlumnos(alumnos.subList(0, 0));//Seteamos la lista de alumnos en el curso
        
        
        System.out.println(curso.toString());
        
    }
    
}
