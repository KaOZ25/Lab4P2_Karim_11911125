/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_karimguifarro;

import java.util.*;

public class Lab4P2_KarimGuifarro {

    public static Scanner KaOz = new Scanner(System.in);
    public static Random r = new Random();
    public static ArrayList<Soldados> s = new ArrayList();
    public static ArrayList<Escuadrones> e = new ArrayList();
    public static ArrayList<Zonas> z = new ArrayList();

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
                            try {
                                String nombre, rango;
                                int edad, tiempo_ejer, hp, daño = 50;
                                System.out.println("Ingrese el nombre del soldado:");
                                nombre = KaOz.next();
                                System.out.println("Ingrese el rasngo del soldado:");
                                rango = KaOz.next();
                                System.out.println("Ingrese la edad:");
                                edad = KaOz.nextInt();
                                while (edad < 0) {
                                    System.out.println("Ingrese el dato otra vez:");
                                    edad = KaOz.nextInt();
                                }
                                System.out.println("Ingrese el tiempo de estadia en el ejercito:");
                                tiempo_ejer = KaOz.nextInt();
                                while (tiempo_ejer > edad || tiempo_ejer < 0) {
                                    System.out.println("Ingrese el dato de nuevo:");
                                    tiempo_ejer = KaOz.nextInt();
                                }
                                hp = 1 + r.nextInt(4);
                                hp = hp * 100;
                                s.add(new Infanteria_Ligera(nombre, rango, edad, tiempo_ejer, hp, daño));
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        } //fin case 1
                        break;
                        case 2: {
                            try {
                                String nombre, rango;
                                int edad, tiempo_ejer, hp, daño = 150;
                                System.out.println("Ingrese el nombre del soldado:");
                                nombre = KaOz.next();
                                System.out.println("Ingrese el rasngo del soldado:");
                                rango = KaOz.next();
                                System.out.println("Ingrese la edad:");
                                edad = KaOz.nextInt();
                                while (edad < 0) {
                                    System.out.println("Ingrese el dato otra vez:");
                                    edad = KaOz.nextInt();
                                }
                                System.out.println("Ingrese el tiempo de estadia en el ejercito:");
                                tiempo_ejer = KaOz.nextInt();
                                while (tiempo_ejer > edad || tiempo_ejer < 0) {
                                    System.out.println("Ingrese el dato de nuevo:");
                                    tiempo_ejer = KaOz.nextInt();
                                }
                                hp = 1 + r.nextInt(4);
                                hp = hp * 100;
                                s.add(new Infanteriap(nombre, rango, edad, tiempo_ejer, hp, daño));
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        }//fin case 2
                        break;
                        case 3: {
                            try {
                                String nombre, rango;
                                int edad, tiempo_ejer, hp, daño = 140;
                                System.out.println("Ingrese el nombre del soldado:");
                                nombre = KaOz.next();
                                System.out.println("Ingrese el rasngo del soldado:");
                                rango = KaOz.next();
                                System.out.println("Ingrese la edad:");
                                edad = KaOz.nextInt();
                                while (edad < 0) {
                                    System.out.println("Ingrese el dato otra vez:");
                                    edad = KaOz.nextInt();
                                }
                                System.out.println("Ingrese el tiempo de estadia en el ejercito:");
                                tiempo_ejer = KaOz.nextInt();
                                while (tiempo_ejer > edad || tiempo_ejer < 0) {
                                    System.out.println("Ingrese el dato de nuevo:");
                                    tiempo_ejer = KaOz.nextInt();
                                }
                                hp = 1 + r.nextInt(4);
                                hp = hp * 100;
                                s.add(new Sargento(nombre, rango, edad, tiempo_ejer, hp, daño));
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        }//fin case 3
                        break;
                        case 4: {
                            try {
                                String nombre, rango;
                                int edad, tiempo_ejer, hp, daño = 110;
                                System.out.println("Ingrese el nombre del soldado:");
                                nombre = KaOz.next();
                                System.out.println("Ingrese el rasngo del soldado:");
                                rango = KaOz.next();
                                System.out.println("Ingrese la edad:");
                                edad = KaOz.nextInt();
                                while (edad < 0) {
                                    System.out.println("Ingrese el dato otra vez:");
                                    edad = KaOz.nextInt();
                                }
                                System.out.println("Ingrese el tiempo de estadia en el ejercito:");
                                tiempo_ejer = KaOz.nextInt();
                                while (tiempo_ejer > edad || tiempo_ejer < 0) {
                                    System.out.println("Ingrese el dato de nuevo:");
                                    tiempo_ejer = KaOz.nextInt();
                                }
                                hp = 1 + r.nextInt(4);
                                hp = hp * 100;
                                s.add(new Capitan(nombre, rango, edad, tiempo_ejer, hp, daño));
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        }
                        break;
                        case 5: {
                            try {
                                String nombre, rango;
                                int edad, tiempo_ejer, hp, daño = 50;
                                System.out.println("Ingrese el nombre del soldado:");
                                nombre = KaOz.next();
                                System.out.println("Ingrese el rasngo del soldado:");
                                rango = KaOz.next();
                                System.out.println("Ingrese la edad:");
                                edad = KaOz.nextInt();
                                while (edad < 0) {
                                    System.out.println("Ingrese el dato otra vez:");
                                    edad = KaOz.nextInt();
                                }
                                System.out.println("Ingrese el tiempo de estadia en el ejercito:");
                                tiempo_ejer = KaOz.nextInt();
                                while (tiempo_ejer > edad || tiempo_ejer < 0) {
                                    System.out.println("Ingrese el dato de nuevo:");
                                    tiempo_ejer = KaOz.nextInt();
                                }
                                hp = 1000;
                                s.add(new SuperSoldado(nombre, rango, edad, tiempo_ejer, hp, daño));
                            } catch (Exception e) {
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
                    } else {
                        int pos;
                        listS();
                        System.out.println("Ingrese el soldado que desea editar");
                        pos = KaOz.nextInt();
                        while (pos < 0 || pos > s.size()) {
                            System.out.println("La posicion es incorrecta favor volver a ingresarla");
                            pos = KaOz.nextInt();
                        }//fin while
                        System.out.println("1)Nombre\n"
                                + "2)Edad\n"
                                + "3)Rango\n"
                                + "4)tiempo en el ejercito\n");
                        var op2 = KaOz.nextInt();
                        switch (op2) {
                            case 1: {
                                System.out.println("Ingrese el nombre nuevo:");
                                String nombre = KaOz.next();
                                s.get(pos).setNombre(nombre);
                            }
                            break;
                            case 2: {
                                System.out.println("Ingrese la edad:");
                                int edad = KaOz.nextInt();
                                s.get(pos).setEdad(edad);
                            }
                            break;
                            case 3: {
                                System.out.println("Ingrese el Rango");
                                String rango = KaOz.next();
                                s.get(pos).setRango(rango);
                            }
                            break;
                            case 4: {
                                System.out.println("Ingrese su tiempo en el ejercito");
                                int tiem = KaOz.nextInt();
                                while (tiem > s.get(pos).getEdad() || tiem < 0) {
                                    System.out.println("Ingrese el dato de nuevo:");
                                    tiem = KaOz.nextInt();
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
                    pos = KaOz.nextInt();
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
        char k = 'c';
        while (k == 'c' || k == 'C') {
            System.out.println("*****MENU******\n"
                    + "1)Crear\n"
                    + "2)Editar\n"
                    + "3)Listar\n"
                    + "4)Eliminar\n"
                    + "5)Salir");
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {
                    try {
                        String nombre;
                        int tamaño, X, Y;
                        System.out.println("Ingrese el nombre:");
                        nombre = KaOz.next();
                        System.out.println("Ingrese el tamaño de la zona:");
                        tamaño = KaOz.nextInt();
                        while (tamaño < 100 || tamaño > 300) {
                            System.out.println("Ingrese de nuevo el tamaño:");
                            tamaño = KaOz.nextInt();
                        }
                        System.out.println("Ingrese la coordenada X");
                        X = KaOz.nextInt();
                        while (X < 0 || X > 100) {
                            System.out.println("Ingrese de nuevo la coordenada X:");
                            X = KaOz.nextInt();
                        }
                        System.out.println("Ingrese la coordenada Y");
                        Y = KaOz.nextInt();
                        while (Y < 0 || Y > 100) {
                            System.out.println("Ingrese de nuevo la coordenada Y:");
                            Y = KaOz.nextInt();
                        }
                        z.add(new Zonas(nombre, tamaño, X, Y));
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }//fin case 1
                break;
                case 2: {
                    if (s.isEmpty()) {
                        System.out.println("Crear un soldado primero");
                        break;
                    } else {
                        int pos;
                        listS();
                        System.out.println("Ingrese el soldado que desea editar");
                        pos = KaOz.nextInt();
                        while (pos < 0 || pos > z.size()) {
                            System.out.println("La posicion es incorrecta favor volver a ingresarla");
                            pos = KaOz.nextInt();
                        }//fin while
                        System.out.println("1)Nombre\n"
                                + "2)Tamaño\n"
                                + "3)Coordenada X\n"
                                + "4)Coordenada Y\n");
                        var op2 = KaOz.nextInt();
                        switch (op2) {
                            case 1: {
                                System.out.println("Ingrese el nombre:");
                                String nombre = KaOz.next();
                                z.get(pos).setNombre(nombre);
                            }
                            break;
                            case 2: {
                                System.out.println("Ingrese el tamaño:");
                                int tam = KaOz.nextInt();
                                while (tam < 100 || tam > 300) {
                                    System.out.println("Ingrese de nuevo el tamaño:");
                                    tam = KaOz.nextInt();
                                }
                                z.get(pos).setTamaño(tam);
                            }
                            break;
                            case 3: {
                                System.out.println("Ingrese la coordenada X");
                                int X = KaOz.nextInt();
                                while (X < 0 || X > 100) {
                                    System.out.println("Ingrese de nuevo la coordenada X:");
                                    X = KaOz.nextInt();
                                }
                                z.get(pos).setX(X);
                            }
                            break;
                            case 4: {
                                System.out.println("Ingrese la coordenada Y");
                                int Y = KaOz.nextInt();
                                while (Y < 0 || Y > 100) {
                                    System.out.println("Ingrese de nuevo la coordenada Y:");
                                    Y = KaOz.nextInt();
                                }
                                z.get(pos).setY(Y);
                            }

                        }
                    }
                }//fin case 2
                break;
                case 3: {
                    listZ();
                }//fin case 3
                case 4: {
                    int pos;
                    listZ();
                    System.out.println("Ingrese el soldado que desea editar");
                    pos = KaOz.nextInt();
                    while (pos < 0 || pos > z.size()) {
                        System.out.println("La posicion es incorrecta favor volver a ingresarla");
                        pos = KaOz.nextInt();
                    }//fin while
                    z.remove(pos);
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

    public static void Escuadrones() {
        char k = 'c';
        while (k == 'c' || k == 'C') {
            System.out.println("*****MENU******\n"
                    + "1)Crear\n"
                    + "2)Editar\n"
                    + "3)Listar\n"
                    + "4)Eliminar\n"
                    + "5)Salir");
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {
                    String nombre;
                    ArrayList<Zonas> conquista = new ArrayList();
                    ArrayList<Soldados> escuadron = new ArrayList();
                    int contss=0,contc=0,conts=0;
                    System.out.println("Ingrese el nombre:");
                    nombre=KaOz.next();
                    char c='k';
                    listS();
                   while(c=='k'){
                      int pos;
                       System.out.println("Ingrese el soldado que desea añadir a su escuadron");
                       pos=KaOz.nextInt();
                       if (pos>s.size()) {
                           System.out.println("ese soldado no existe");
                       }
                       Soldados sol= s.get(pos);
                       if ((s.get(pos)) instanceof SuperSoldado) {
                           contss=1;
                       }
                       escuadron.add(sol);
                       System.out.println("Desea continuar?[1/2]");
                      int ops=KaOz.nextInt();
                      switch(ops){
                          case 1:{
                              c='k';
                          }
                          break;
                          case 2:{
                              c='j';
                          }
                          break;
                          default:
                              System.out.println("error");
                      }
                   }
                   char l='f';
                   listZ();
                   while(l=='f'){
                        int pos;
                       System.out.println("Ingrese el soldado que desea añadir a su escuadron");
                       pos=KaOz.nextInt();
                       if (pos>s.size()) {
                           System.out.println("ese soldado no existe");
                       }
                       Zonas sol= z.get(pos);
                       conquista.add(sol);
                       System.out.println("Desea continuar?[1/2]");
                      int ops=KaOz.nextInt();
                      switch(ops){
                          case 1:{
                              l='f';
                          }
                          break;
                          case 2:{
                              l='o';
                          }
                          break;
                          default:
                              System.out.println("error");
                      }
                   }
                   e.add(new Escuadrones(nombre,escuadron,conquista));
                }//fin case 1
                break;
                case 2: {
                   
                }//fin case 2
                break;
                case 3: {
                   listE();
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

    public static void simulacion() {

    }

    public static void listS() {
        int cont = 0;
        for (Soldados so : s) {
            System.out.println(cont + " " + so);
            cont++;
        }
    }

    public static void listZ() {
        int cont = 0;
        for (Zonas zo : z) {
            System.out.println(cont + " " + zo);
            cont++;
        }
    }
    public static void listE() {
        int cont = 0;
        for (Escuadrones es : e) {
            System.out.println(cont + " " + es);
            cont++;
        }
    }
}
