/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


import controller.BarajaController;
import controller.CartaController;

/**
 *
 * @author ajuand
 */
public class CartaApp {

   private static Vista vista = new Vista();; 
   private static BarajaController barajaController= new BarajaController();
   private static CartaController cartaController= new CartaController();

    
        
        
       
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op=0;
        boolean reiniciar=false;
        do {
            
            if(reiniciar){
                barajaController.reiniciarJuego();
                reiniciar=false;
            }
            vista.mostrarMenuPrincipal();
            op = vista.leerOpcion();

            switch (op) {
                case 1://barajar
                    
                    
                    vista.mostrarCartas(barajaController.mostrarBaraja(), "ANTES DE BARAJAR");
                    barajaController.barajar();
                    vista.mostrarCartas(barajaController.mostrarBaraja(), "DESPUES DE BARAJAR");
                    
                    break;
                case 2://Siguiente carta
                   vista.mostrarCarta(barajaController.mostrarSiguienteCarta());
                    
                    break;
                case 3://Carta Siponible
                    vista.mostrarCantidadCartasDisponible(barajaController.numeroCartasDisponible());
                    break;
                case 4:// dar Cartas
                    //barajaController.entregaDarcartas(vista.leerCantidadCartas());
                    vista.mostrarCartas(barajaController.entregaDarcartas(vista.leerCantidadCartas()), "DAR CARTAS");
                    break;
                case 5://Cartas Monton
                    vista.mostrarCartas(barajaController.mostrarMonton(),"CARTAS MONTON");
                    break;
                case 6://Mostrar barajas
                    vista.mostrarCartas(barajaController.mostrarBaraja(),"BARAJA");
                    
                    break;
                 case 7://Reiniciar juego
                     reiniciar=true;
                    break;
                case 8:
                    System.out.println("Fin del juego");
                    break;

            }
        } while (op != 8);

    }
    
    //------------------------------
    

}
