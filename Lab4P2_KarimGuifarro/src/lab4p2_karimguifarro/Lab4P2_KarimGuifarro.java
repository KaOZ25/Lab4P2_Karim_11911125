/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_karimguifarro;

import java.util.*;

public class Lab4P2_KarimGuifarro {

    public static Scanner KaOz = new Scanner(System.in);
    public static  Random r=new Random();
    public static ArrayList <Soldados> s=new ArrayList();
    public static ArrayList <Escuadrones> e=new ArrayList();
        public static ArrayList <Zonas> z=new ArrayList();

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
        char k = 'c';
        while (k == 'c' || k == 'C') {
            System.out.println("*****MENU******\n"
                    + "1)Crear\n"
                    + "2)Editar\n"
                    + "3)Listar\n"
                    + "4)Salir");
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Tipos\n"
                            + "1)Infanteria Ligera\n"
                            + "2)Infanteria Pesada\n"
                            + "3)Sargento\n"
                            + "4)Capitan\n"
                            + "5)Super Soldado");
                    int ops = KaOz.nextInt();
                    switch (op) {
                        case 1: {
                            try{
                            String nombre, rango;
                            int edad, tiempo_ejer, hp,daño=50;
                            System.out.println("Ingrese el nombre del soldado:");
                            nombre=KaOz.next();
                            System.out.println("Ingrese el rasngo del soldado:");
                            rango=KaOz.next();
                            System.out.println("Ingrese la edad:");
                            edad=KaOz.nextInt();
                            while(edad<0){
                                System.out.println("Ingrese el dato otra vez:");
                                edad=KaOz.nextInt();
                            }
                            System.out.println("Ingrese el tiempo de estadia en el ejercito:");
                            tiempo_ejer=KaOz.nextInt();
                            while(tiempo_ejer>edad || tiempo_ejer<0){
                                System.out.println("Ingrese el dato de nuevo:");
                                tiempo_ejer=KaOz.nextInt();
                            }
                            hp=1+r.nextInt(4);
                            hp=hp*100;
                            s.add(new Infanteria_Ligera(nombre,rango,edad,tiempo_ejer,hp,daño));
                            }catch(Exception e){
                                System.out.println(e);
                            }
                        } //fin case 1
                        break;
                        case 2:{
                            try{
                            String nombre, rango;
                            int edad, tiempo_ejer, hp,daño=150;
                            System.out.println("Ingrese el nombre del soldado:");
                            nombre=KaOz.next();
                            System.out.println("Ingrese el rasngo del soldado:");
                            rango=KaOz.next();
                            System.out.println("Ingrese la edad:");
                            edad=KaOz.nextInt();
                            while(edad<0){
                                System.out.println("Ingrese el dato otra vez:");
                                edad=KaOz.nextInt();
                            }
                            System.out.println("Ingrese el tiempo de estadia en el ejercito:");
                            tiempo_ejer=KaOz.nextInt();
                            while(tiempo_ejer>edad || tiempo_ejer<0){
                                System.out.println("Ingrese el dato de nuevo:");
                                tiempo_ejer=KaOz.nextInt();
                            }
                            hp=1+r.nextInt(4);
                            hp=hp*100;
                            s.add(new Infanteriap(nombre,rango,edad,tiempo_ejer,hp,daño));
                            }catch(Exception e){
                                System.out.println(e);
                            }
                        }//fin case 2
                        break;
                        case 3:{
                            try{
                            String nombre, rango;
                            int edad, tiempo_ejer, hp,daño=140;
                            System.out.println("Ingrese el nombre del soldado:");
                            nombre=KaOz.next();
                            System.out.println("Ingrese el rasngo del soldado:");
                            rango=KaOz.next();
                            System.out.println("Ingrese la edad:");
                            edad=KaOz.nextInt();
                            while(edad<0){
                                System.out.println("Ingrese el dato otra vez:");
                                edad=KaOz.nextInt();
                            }
                            System.out.println("Ingrese el tiempo de estadia en el ejercito:");
                            tiempo_ejer=KaOz.nextInt();
                            while(tiempo_ejer>edad || tiempo_ejer<0){
                                System.out.println("Ingrese el dato de nuevo:");
                                tiempo_ejer=KaOz.nextInt();
                            }
                            hp=1+r.nextInt(4);
                            hp=hp*100;
                            s.add(new Sargento(nombre,rango,edad,tiempo_ejer,hp,daño));
                            }catch(Exception e){
                                System.out.println(e);
                            }
                        }//fin case 3
                        break;
                        case 4:{
                            try{
                            String nombre, rango;
                            int edad, tiempo_ejer, hp,daño=110;
                            System.out.println("Ingrese el nombre del soldado:");
                            nombre=KaOz.next();
                            System.out.println("Ingrese el rasngo del soldado:");
                            rango=KaOz.next();
                            System.out.println("Ingrese la edad:");
                            edad=KaOz.nextInt();
                            while(edad<0){
                                System.out.println("Ingrese el dato otra vez:");
                                edad=KaOz.nextInt();
                            }
                            System.out.println("Ingrese el tiempo de estadia en el ejercito:");
                            tiempo_ejer=KaOz.nextInt();
                            while(tiempo_ejer>edad || tiempo_ejer<0){
                                System.out.println("Ingrese el dato de nuevo:");
                                tiempo_ejer=KaOz.nextInt();
                            }
                            hp=1+r.nextInt(4);
                            hp=hp*100;
                            s.add(new Capitan(nombre,rango,edad,tiempo_ejer,hp,daño));
                            }catch(Exception e){
                                System.out.println(e);
                            }
                        }
                        break;
                        case 5:{
                            try{
                            String nombre, rango;
                            int edad, tiempo_ejer, hp,daño=50;
                            System.out.println("Ingrese el nombre del soldado:");
                            nombre=KaOz.next();
                            System.out.println("Ingrese el rasngo del soldado:");
                            rango=KaOz.next();
                            System.out.println("Ingrese la edad:");
                            edad=KaOz.nextInt();
                            while(edad<0){
                                System.out.println("Ingrese el dato otra vez:");
                                edad=KaOz.nextInt();
                            }
                            System.out.println("Ingrese el tiempo de estadia en el ejercito:");
                            tiempo_ejer=KaOz.nextInt();
                            while(tiempo_ejer>edad || tiempo_ejer<0){
                                System.out.println("Ingrese el dato de nuevo:");
                                tiempo_ejer=KaOz.nextInt();
                            }
                            hp=1000;
                            s.add(new SuperSoldado(nombre,rango,edad,tiempo_ejer,hp,daño));
                            }catch(Exception e){
                                System.out.println(e);
                            }
                        }//fin case 5
                        break;
                    }//fin switch de soldados

                }//fin case 1
                break;
                case 2: {
                    if (s.isEmpty()) {
                        System.out.println("Crear un soldado primero");
                        break;
                    } else{
                   int pos;
                   listS();
                    System.out.println("Ingrese el soldado que desea editar");
                    pos=KaOz.nextInt();
                    while (pos < 0 || pos > s.size()) {
                        System.out.println("La posicion es incorrecta favor volver a ingresarla");
                        pos = KaOz.nextInt();
                    }//fin while
                        System.out.println("1)Nombre\n"
                                + "2)Edad\n"
                                + "3)Rango\n"
                                + "4)tiempo en el ejercito\n");
                       var op2=KaOz.nextInt();
                       switch(op2){
                           case 1:{
                               System.out.println("Ingrese el nombre nuevo:");    
                               String nombre=KaOz.next();
                               s.get(pos).setNombre(nombre);
                           }
                           break;
                           case 2:{
                               System.out.println("Ingrese la edad:");
                               int edad=KaOz.nextInt();
                               s.get(pos).setEdad(edad);
                           }
                           break;
                           case 3:{
                               System.out.println("Ingrese el Rango");
                               String rango=KaOz.next();
                               s.get(pos).setRango(rango);
                           }
                           break;
                           case 4:{
                               System.out.println("Ingrese su tiempo en el ejercito");
                               int tiem=KaOz.nextInt();
                                while(tiem>s.get(pos).getEdad() || tiem<0){
                                System.out.println("Ingrese el dato de nuevo:");
                                tiem=KaOz.nextInt();
                            }
                               s.get(pos).setTiempo_ejer(tiem);
                           }
                           break;     
                       }
                    }
                }//fin case 2
                break;
                case 3: {
                   listS();
                }//fin case 3
                case 4: {
                   int pos;
                   listS();
                    System.out.println("Ingrese el soldado que desea editar");
                    pos=KaOz.nextInt();
                    while (pos < 0 || pos > s.size()) {
                        System.out.println("La posicion es incorrecta favor volver a ingresarla");
                        pos = KaOz.nextInt();
                    }//fin while
                    s.remove(pos);
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

    public static void Zonas() {

    }

    public static void Escuadrones() {

    }

    public static void simulacion() {

    }
    public static void listS(){
        int cont=0;
        for (Soldados so : s) {
            System.out.println(cont + " "+  so);
            cont++;
        }
    }
}
