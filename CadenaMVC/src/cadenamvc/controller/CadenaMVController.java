/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenamvc.controller;

import cadenamvc.model.CadenaMVC;
import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class CadenaMVController {

    private CadenaMVC cadenaMVC;

    Scanner leer = new Scanner(System.in);

    public CadenaMVController() {
    }

    public CadenaMVController(CadenaMVC cadenaMVC) {
        this.cadenaMVC = cadenaMVC;
    }

    public CadenaMVC crear() {

        System.out.println("Ingrese la frase :");

        return new CadenaMVC(leer.nextLine());
    }

    public void mostrarCadena(CadenaMVC cadenaMVC) {
        System.out.println("Cadena es " + cadenaMVC.getFrase());
    }

    public void mostrarVocales(CadenaMVC cadenaMVC) {
        int contVocal = 0;
        for (int i = 0; i < cadenaMVC.getLogitud(); i++) {
            switch (cadenaMVC.getFrase().charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contVocal += 1;
                    break;

            }
        }
        System.out.println("El numero de vocales es: " + contVocal);
    }

    public void invertirFrase(CadenaMVC cadenaMVC) {
        String invertida = "";
        for (int i = cadenaMVC.getLogitud() - 1; i >= 0; i--) {
            invertida = invertida.concat(cadenaMVC.getFrase().charAt(i) + "");

        }

        System.out.println("La frase invertida es: " + invertida);
    }

    public int vecesRepetido(char letra, CadenaMVC cadenaMVC) {
        int contaRepetir = 0;
        for (int i = 0; i < cadenaMVC.getLogitud(); i++) {
            if (cadenaMVC.getFrase().charAt(i) == letra) {
                contaRepetir++;
            }

        }

        return contaRepetir;
    }

    public void compararLongitud(String frase, CadenaMVC cadenaMVC) {
        if (frase.length() == cadenaMVC.getLogitud()) {
            System.out.println("La logitud es igual");
        } else {
            System.out.println("La logitud es diferente " + frase.length() + " y " + cadenaMVC.getLogitud());
        }
    }

    public String unirFrases(String frase, CadenaMVC cadenaMVC) {
        return cadenaMVC.getFrase().concat(frase);
    }

    public String remplazar(String letra, CadenaMVC cadenaMVC) {
        return cadenaMVC.getFrase().replace('a', letra.charAt(0));
    }

    public boolean contiene(String letra, CadenaMVC cadenaMVC) {
        return cadenaMVC.getFrase().contains(letra);
    }

}
