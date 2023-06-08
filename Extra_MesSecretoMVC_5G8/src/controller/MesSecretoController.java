/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.MesSecreto;

/**
 *
 * @author ajuand
 */
public class MesSecretoController {
    

    
   public boolean adivine(MesSecreto ms,String mes1){
       for (String me : ms.getMes()) {
           if (me.equals(mes1)) {
               return true;
           }
       }
       
       return false;
   }
    
    
    
    
    
}
