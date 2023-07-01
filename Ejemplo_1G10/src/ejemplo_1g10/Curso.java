/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_1g10;

import java.util.List;

/**
 *
 * @author ajuand
 */
public class Curso{
    private int anio;
    private char division;
    private Profesor profesor;
    private List<Alumno> alumnos;
    
    
    public Profesor getProfesor(){
    return profesor;
    }
    
    public void setProfesor (Profesor p){
        this.profesor=p;
    }

    public Curso() {
    }

    public Curso(int anio, char division, Profesor profesor) {
        this.anio = anio;
        this.division = division;
        this.profesor = profesor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "anio=" + anio + ", division=" + division + ", profesor=" + profesor + ", alumnos=" + alumnos + '}';
    }

    
    
    
    
}
