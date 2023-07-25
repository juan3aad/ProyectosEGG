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
public class Lavadora extends Electrodomestico{
    private String carga;

    public Lavadora() {
        
    }

    public Lavadora(String carga, double precio, String color, char consumoEnergetico) {
        super(precio, color, consumoEnergetico);
        this.carga = carga;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() +this.carga; //To change body of generated methods, choose Tools | Templates.
    }

   

    
}
