/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class Lavadora extends Electrodomestico {
    private double carga;
    
    public Lavadora(){
        super();//llama al constructor vacio de la clase padre
        carga=0;
    }
    
    //Constructor con los parametros

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico) {
        super(precio, color, consumoEnergetico);
        this.carga = carga;
    }
    
    //metodos getter y Setter

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }



   
    //-----------------------------
    public void crearLavadora(){
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga:");
        this.setCarga(leer.nextDouble());
    }
    
    @Override
    public double precioFinal(){
        //llamams al metodo precio final de la super clase para obtener el precio base
        double precioFinalLavadora= super.precioFinal();
        
        //acontinuación se agrega la funcionalidad especifica de la lavadora
        if(this.carga>30){
            precioFinalLavadora+=500;
        }
        return precioFinalLavadora;
    }
    
    
    
}
