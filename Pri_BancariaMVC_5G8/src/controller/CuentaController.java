/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import model.Cuenta;

/**
 *
 * @author ajuand
 */
public class CuentaController {
    private Cuenta c;
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        c=new Cuenta();
        
        System.out.println("Ingrese el DNI:");
        c.setDNI(leer.nextLong());
        
        System.out.println("Ingrese el saldo:");
        c.setSaldoActual(leer.nextInt());
        
        System.out.println("Ingrese el numero de cuenta:");
        c.setNumeroCuenta(leer.nextInt());
        return c;
    }
    
    public void ingresar(double ingreso){
        c.setSaldoActual(c.getSaldoActual()+ingreso);
    }
    
    public void retirar(double retiro){
        if(retiro>c.getSaldoActual()){
            c.setSaldoActual(0);
        }
        else
        {
            c.setSaldoActual(c.getSaldoActual()-retiro);
        }
        
    }
    
    public void extraccionRapida(){
        if ((c.getSaldoActual()*0.20)>c.getSaldoActual()){
            c.setSaldoActual(c.getSaldoActual()-(c.getSaldoActual()*0.20));
        }
    }
    
    public double consultarSaldo(){
        return c.getSaldoActual();
    }
    
    public void consultarDatos(){
        System.out.println(c.toString());
    }
    
}
