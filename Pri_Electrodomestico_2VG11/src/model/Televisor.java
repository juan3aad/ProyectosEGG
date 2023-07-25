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
public class Televisor  extends Electrodomestico{
    private double resolucion;
    private boolean TDT;

    //Constructor vacio
    public Televisor() {
        super();
        resolucion=0;
        TDT=false;
    }
    
    ///Constructor con los parametros

    public Televisor(double resolucion, boolean TDT) {
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Televisor(double resolucion, boolean TDT, double precio, String color, char consumoEnergetico) {
        super(precio, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    public void crearTelevisor(){
        super.crearElectrodomestico();
        System.out.println("Ingrese resolucion: ");
        this.setResolucion(leer.nextDouble());
        
        System.out.println("Tiene TDT s o n");
        String op=leer.next();
        
        switch (op) {
            case "s":
            case "S":
                this.setTDT(true);
                break;
            default:
                 this.setTDT(false);
        }
        
    }
    //------------------------------------
    public double precioFinal(){
        double precioFinalTelevisor=super.precioFinal();
        if(this.getResolucion()>40){
            precioFinalTelevisor*=1.3;
        }
        if(this.TDT){
            precioFinalTelevisor+=500;
        }
        
        return precioFinalTelevisor;
    }
    
    
    
    
}
