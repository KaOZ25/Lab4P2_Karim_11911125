/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_karimguifarro;

import java.util.*;

public class Lab4P2_KarimGuifarro {

    public static Scanner KaOz = new Scanner(System.in);

    public static void main(String[] args) {
        char k = 'c';
        while (k == 'c' || k == 'C') {
            System.out.println("*****MENU******\n"
                    + "1)Soldados\n"
                    + "2)Zonas\n"
                    + "3)Escuadrones\n"
                    + "4)Simulacion\n"
                    + "5)Salir");
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {
                    Soldados();
                }//fin case 1
                break;
                case 2: {
                    Zonas();
                }//fin case 2
                break;
                case 3: {
                    Escuadrones();
                }//fin case 3
                case 4: {
                    simulacion();
                }//fin case 4
                break;
                case 5: {
                    System.exit(0);
                }
                default:
                    System.out.println("Valor erroneo");
            }
        }
    }

    public static void Soldados() {

    }

    public static void Zonas() {

    }

    public static void Escuadrones() {

    }

    public static void simulacion() {

    }

}
