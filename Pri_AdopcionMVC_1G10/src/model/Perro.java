/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ajuand
 */
public class Perro {
    private String nombre;
    private Integer edad;
    private String tamano;
    private boolean adoptado;

    public Perro(String nombre, Integer edad, String tamano, boolean adoptado) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamano = tamano;
        this.adoptado=adoptado;
        
    }

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + ", tamano=" + tamano + ", adoptado=" + adoptado + '}';
    }

    

    
    
    
    
    
}
