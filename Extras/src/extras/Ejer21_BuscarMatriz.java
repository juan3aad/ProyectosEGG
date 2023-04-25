/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author ajuand
 */
public class Ejer21_BuscarMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] m = new int[10][10];
        int[][] p = new int[3][3];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                m[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + m[i][j] + "]  ");
            }
            System.out.println("");
        }

        System.out.println("-----------------------------------");
        System.out.println("Ingrese numero:");
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                p[i][j] = leer.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + p[i][j] + "]  ");
            }
            System.out.println("");
        }

        System.out.println("-------------------------------Buscar----");
        int auxI = 0, auxJ = 0;
        int f = 0, c = 0, cont = 0;
        int i = 0;
        int j = 0;
        for (i = 0; i < 10; i++) {
            f = 0;
            c = 0;
            for (j = 0; j < 10; j++) {
                if (p[f][c] == m[i][j]) {
                    cont = 0;
                    auxI = i;
                    auxJ = j;
                    for (f = 0; f < 3; f++) {
                        auxJ = j;
                        for (c = 0; c < 3; c++) {
                            if (p[f][c] == m[auxI][auxJ]) {
                                cont = cont + 1;
                            } else {
                                break;
                            }
                            if (auxJ < 9) {
                                auxJ++;
                            }
                        }
                        if (auxI < 9) {
                            auxI++;
                        }
                        if (cont == 9) {
                            break;
                        }
                    }

                }
                if (cont == 9) {
                    break;
                }
            }
            if (cont == 9) {
                break;
            }
        }

        if (cont == 9) {
            System.out.println("Matriz encontrada en esta posición [" + i + "][" + j + "]");
        } else {
            System.out.println("Matriz No encontrada");
        }

    }

}
