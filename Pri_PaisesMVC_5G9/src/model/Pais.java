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
public class Pais implements Comparable<Pais> {

    private String nomPais;

    public Pais(String nomPais) {
        this.nomPais = nomPais;
    }

    public Pais() {
    }

    public String getNomPais() {
        return nomPais;
    }

    public void setNomPais(String nomPais) {
        this.nomPais = nomPais;
    }

    @Override
    public String toString() {
        return "Pais{" + "nomPais=" + nomPais + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nomPais);
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
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nomPais, other.nomPais)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Pais o) {
        return this.nomPais.compareTo(o.getNomPais());
    }

}
