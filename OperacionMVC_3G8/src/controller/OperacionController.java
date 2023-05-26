/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import model.Operacion;

/**
 *
 * @author ajuand
 */
public class OperacionController {

    private Operacion o;

    Scanner leer = new Scanner(System.in);

    public OperacionController() {
    }

    public Operacion crearOperacion() {
        System.out.println("Ingrese el numero 1 y el numero 2");

        o = new Operacion(leer.nextInt(), leer.nextInt());
        return o;
    }

    public int sumar() {
        return o.getNumero1() + o.getNumero2();
    }

    public int resta() {
        return o.getNumero1() - o.getNumero2();
    }

    public int multiplicacion() {
        if (o.getNumero1() > 0 && o.getNumero2() > 0) {
            return o.getNumero1() * o.getNumero2();
        } else {
            System.out.println("Error no se puede realizar multiplicación por cero");
        }
        return 0;
    }
    
    public int dividir(){
        if(o.getNumero2()==0){
            System.out.println("Error no se puede realizar división por cero");
            return 0;
        }
        else
        {
            return o.getNumero1()/o.getNumero2();
        }
    }

}
