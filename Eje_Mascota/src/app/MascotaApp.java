/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.MascotaController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ajuand
 */
public class MascotaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Arrays
        MascotaController masContro= new MascotaController();
        //masContro.crearMascota();
        //masContro.crearMascota();
        //masContro.fabricaChiquitos(40);
        
//        masContro.fabricaMascotas(2);
//        
//        
//        masContro.mostrarMascotas();
//        
//        masContro.actualizarMascota1(5);
//        
//        
//        masContro.mostrarMascotas();
//        
//        masContro.actualizarMascota2(0);
//        
//        
//        masContro.mostrarMascotas();
//        
//        masContro.eliminarMascota(0);
//        masContro.mostrarMascotas();


String[] nombres={"Pepe","Pepa"};
List<String> nombreList = new ArrayList(Arrays.asList(nombres));
List<String>nombreList2= new ArrayList();
nombreList2.addAll(0, nombreList);


        
        
        
        
        
    }
    
}
