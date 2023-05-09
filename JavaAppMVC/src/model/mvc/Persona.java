/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.mvc;

/**
 *
 * @author ajuand
 */
public class Persona {
    private String nombre;
    private Integer edad;
    private Double peso;

    //Constructor por defecto
    public Persona() {
    }

    //Constructor por parametros

    public Persona(String nombre, Integer edad, Double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    
    

    

    public String getNombre() {
        return nombre;
    }

    /**
     * Getter and Setter
     * @return
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
    
    
    
    
    
    
    
}
