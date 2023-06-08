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
public class MesSecreto {
    private String [] mes={"enero","febrero","marzo","abril","mayo","junio","Julio","agosto","septiembre","octubre","noviembre","diciembre"};

    public MesSecreto(String[] mes) {
        this.mes = mes;
    }

    public MesSecreto() {
        
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }
    
    
    
}
