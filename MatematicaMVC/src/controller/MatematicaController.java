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
    public double devolverMayor(Matematica m) {
        
        System.out.println("Numero 1:" + m.getNum1());
        System.out.println("Numero 2:" + m.getNum2());

       
        return Math.max(m.getNum1(), m.getNum2());

    }

    //Metodo para retornar la potencia
    public double calcularPotencia(Matematica m) {
        
        double num1Re=Math.round(m.getNum1());
        double num2Re= Math.round(m.getNum2());
        
        System.out.println("Redondeado 1 :"+ num1Re);
        System.out.println("Redondeado 2 :"+ num2Re);
        
               
        return Math.pow(Math.max(num1Re, num2Re), Math.min(num1Re,num2Re));
      
    }
    
    
    //metodo para calcular la raiz
    public double calculaRaiz(Matematica m){
        return Math.sqrt(Math.abs(Math.min(m.getNum1(), m.getNum2())));
    }
    

}
