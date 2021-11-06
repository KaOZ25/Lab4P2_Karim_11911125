/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_karimguifarro;



import java.util.*;
public class Infanteria_Ligera extends Soldados{
    Random r=new Random();
    int daño;

    public Infanteria_Ligera(String nombre, String rango, int edad, int tiempo_ejer, int hp, int daño) {
        super(nombre, rango, edad, tiempo_ejer, hp);
        this.daño = daño;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return super.toString() + "daño=" + daño + '}';
    }

    @Override
    public void ataque() {
        int random;
        String arma="";
        random=0+r.nextInt(5);
        switch(random){
            case 1:
                arma="cuchillo";
                break;
            case 2:
                arma="Espada";
            case 3:
                arma="Lanza";
            case 4:
                arma="Daga";
            case 5:
                arma="hacha";
        }
        System.out.println("el soldado" + super.getNombre() + "ha causado" + daño + "de daño con su" + arma );
    }
    
   
    
    
}
