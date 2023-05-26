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
    
    private Ahorcado a;
    String [] solucion;
            
Scanner leer= new Scanner(System.in);
    public AhorcadoController(Ahorcado a) {
        this.a = a;
    }

    public AhorcadoController() {
        
        
    }
    
    public void crearJuego(){
        
        
        System.out.println("Ingresar palabra:");
        String palabra1= leer.nextLine();
        String [] palabra2= new String[palabra1.length()];
        solucion= new String[palabra1.length()];
        for (int i = 0; i <palabra2.length; i++) {
            palabra2[i]=palabra1.charAt(i)+"";
            solucion[i]="_ ";
        }
        
        System.out.println("Cantidad de jugadas:");
        int cantJugaMax=leer.nextInt();
        
       this.a=new Ahorcado(palabra2,0,cantJugaMax);
        
        
    }
    
    public int longitud(){
        return a.getVector().length;
    }
    
    public void buscar(String letra){
        for (int i = 0; i < this.longitud(); i++) {
            if(letra.equals(a.getVector()[i])){
                System.out.println("La letra pertenece a la palabra");
                break;
            }
            
        }
    }
    
    public void encontradas(String letra){
        int conta=0;
        boolean bandera=false;
        for (int i = 0; i < this.longitud(); i++) {
            if(letra.equals(a.getVector()[i])){
                conta++;
                bandera=true;
                solucion[i]=letra;
            }
            
        }
        
        for (int i = 0; i < this.longitud(); i++) {
            System.out.print(solucion[i]);
            
        }
        System.out.println("");
        
        if (bandera==false){
           a.setCantidaMax(a.getCantidaMax()-1);
        }
        else{
            a.setCantidaEncontrada(a.getCantidaEncontrada()+conta);
        }
        
        System.out.println("Número de letras(encontradas, faltantes): ("+a.getCantidaEncontrada()+" , "+(this.longitud()-a.getCantidaEncontrada())+")");
        
    }
    public int intentos(){
               
        return a.getCantidaMax();
    }
    
    
}
