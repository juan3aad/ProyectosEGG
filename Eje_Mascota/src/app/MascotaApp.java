/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.MascotaController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import model.Mascota;
import utilidades.Comparadores;

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
        //MascotaController masContro= new MascotaController();
        //masContro.crearMascota();
        //masContro.crearMascota();
        //masContro.fabricaChiquitos(40);

        //masContro.fabricaMascotas(2);
//        
//        
        //masContro.mostrarMascotas();
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

        /*
String[] nombres={"Pepe","Pepa"};
List<String> nombreList = new ArrayList(Arrays.asList(nombres));
List<String>nombreList2= new ArrayList();
nombreList2.addAll(0, nombreList);
         */
//FILA       <Columna             >
        //ArrayList<ArrayList<String>> matriz= new ArrayList() ;
        //Comparator
     ArrayList<Mascota>mascotas= new ArrayList();
        //Set<String> hashSet = new HashSet<String>();
//        HashSet<Mascota> mascotas = new HashSet();
//TreeSet<Mascota>mascotas=new TreeSet();
        mascotas.add(new Mascota("Ales", "Chiquito", "Perro", 7));
        mascotas.add(new Mascota("Xiro", "dager", "Perro", 6));
        mascotas.add(new Mascota("Dany", "dedo", "Gato", 10));
        mascotas.add(new Mascota("Luna", "piedra", "Perro", 34));
        mascotas.add(new Mascota("Luna", "piedra", "Perro", 34));
        mascotas.add(new Mascota("Luna", "piedra", "Perro", 34));
        mascotas.add(new Mascota("Luna", "piedra", "Perro", 34));
        mascotas.add(new Mascota("Ana", "piedra", "Ave", 56));
        mascotas.add(new Mascota("Ana", "piedra", "Ave", 56));
//        System.out.println("----Descendente");
//     Collections.sort(mascotas,Comparadores.ordenarPorNombreDesc);
//     
//     
        for (Mascota mascota:mascotas) {
            System.out.println(mascota);
            
        }
//        
//        System.out.println("----Ascendente");
//        Collections.sort(mascotas,Comparadores.ordenarPorNombreAsc);
//     
//     
//        for (Iterator<Mascota> it = mascotas.iterator(); it.hasNext();) {
//            Mascota mascota = it.next();
//            System.out.println(mascota);
//        }
//        
//        System.out.println("---En Desorden");
//        
//        Collections.shuffle(mascotas);
//        
//        for (Mascota mascota:mascotas) {
//            System.out.println(mascota);
//            
//        }
//        
//        System.out.println("------Utilizando HashSet");
//        for (Mascota mascota : mascotas) {
//            System.out.println(mascota);
//        }
//        HashMap<String, Mascota> mascotas = new HashMap();
//        mascotas.put("1", new Mascota("Ana", "Car", "Perro", 1));
//        mascotas.put("2", new Mascota("AAve", "Car", "lo", 2));
//        
//        mascotas.remove("2");
//
//        for (Map.Entry<String, Mascota> aux : mascotas.entrySet()) {
//            String key = aux.getKey();
//            Mascota value = aux.getValue();
//            
//            System.out.println("Key "+ key + " value "+value);
//
//        }

    }

}
