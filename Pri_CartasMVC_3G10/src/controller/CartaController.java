/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Carta;

/**
 *
 * @author ajuand
 */
public class CartaController {

    private Carta carta;

    public CartaController() {
    }

    public CartaController(int numero, String palo) {
        carta = new Carta(numero, palo);

    }
    
    

}
