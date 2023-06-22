/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author ajuand
 */
public class Mascota  implements Comparable<Mascota>{
    private String nombre;
    private String apodo;
    private String tipo;
    private Integer edad;

    public Mascota() {
    }

    public Mascota(String nombre, String apodo, String tipo, Integer edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.edad = edad;
    }



    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.apodo);
        hash = 59 * hash + Objects.hashCode(this.tipo);
        hash = 59 * hash + Objects.hashCode(this.edad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mascota other = (Mascota) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apodo, other.apodo)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Mascota o) {
        return this.getNombre().compareTo(o.getNombre());
    }
    
    
    
}
