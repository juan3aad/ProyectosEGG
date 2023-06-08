/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;
import model.Ahorcado;

/**
 *
 * @author ajuand
 */
public class AhorcadoController {

    private Ahorcado ah;
    Scanner leer = new Scanner(System.in);
    char[] vecLetras2;
    public AhorcadoController() {
    }

    public void llenar(){
        for (int i = 0; i < vecLetras2.length; i++) {
            vecLetras2[i]='_';
            
        }
        
    }
    
    public void crearJuego() {

        System.out.println("Ingrese la palabra: ");
        String palabra = leer.nextLine();

        System.out.println("Ingrese la cantidad de jugadas max: ");
        int maxJug = leer.nextInt();

        char[] vectLetras = new char[palabra.length()];
       vecLetras2= new char[palabra.length()];
         llenar();
        vectLetras = palabra.toCharArray();

        this.ah = new Ahorcado(vectLetras, 0, maxJug);

    }

    public void mostrar() {
        System.out.println(this.ah.toString());
    }

    public int longitud() {
        return ah.getVectorPalabra().length;
    }

    public void buscar(char letra) {
        for (int i = 0; i < ah.getVectorPalabra().length; i++) {

            if (ah.getVectorPalabra()[i] == letra) {
                System.out.println("La letra ingresada si hace parte de la palabra");
                break;
            }

        }
    }

    public void encontradas(char letra) {
        boolean encontra = false;
        int cont = 0;

        for (int i = 0; i < ah.getVectorPalabra().length; i++) {

            if (ah.getVectorPalabra()[i] == letra) {
                vecLetras2[i]=letra;
                encontra = true;
                cont++;

            }

        }
        if (encontra == false) {
            ah.setCantMaxJugadas(ah.getCantMaxJugadas() - 1);
        } else {
            ah.setCantLetrasFind(ah.getCantLetrasFind() + cont);
        }
        System.out.println("Número de letras(encontradas,faltantes): (" + ah.getCantLetrasFind() + " , " + (this.longitud() - ah.getCantLetrasFind()));
        
        for (int i = 0; i < this.longitud()   ; i++) {
            System.out.print(vecLetras2[i]);
            
        }
        System.out.println("");
       
    }

    public int intentos() {
       // System.out.println("Número de oprtunidades restantes: "+ah.getCantMaxJugadas());
       return  ah.getCantMaxJugadas();
    }

}
