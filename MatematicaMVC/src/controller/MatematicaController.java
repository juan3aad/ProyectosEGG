/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Matematica;

/**
 *
 * @author ajuand
 */
public class MatematicaController {

    private Matematica matematica;

    public MatematicaController(Matematica matematica) {
        this.matematica = matematica;

    }
    
    public MatematicaController() {
      

    }
    

     //metodo que retonar el mayor valor
    public double devolverMayor() {
        
        System.out.println("Numero 1:" + matematica.getNum1());
        System.out.println("Numero 2:" + matematica.getNum2());

       
        return Math.max(matematica.getNum1(), matematica.getNum2());

    }

    //Metodo para retornar la potencia
    public double calcularPotencia() {
        
        double num1Re=Math.round(matematica.getNum1());
        double num2Re= Math.round(matematica.getNum2());
        
        System.out.println("Redondeado 1 :"+ num1Re);
        System.out.println("Redondeado 2 :"+ num2Re);
        
               
        return Math.pow(Math.max(num1Re, num2Re), Math.min(num1Re,num2Re));
      
    }
    
    
    //metodo para calcular la raiz
    public double calculaRaiz(){
        return Math.sqrt(Math.abs(Math.min(matematica.getNum1(), matematica.getNum2())));
    }
    

}
