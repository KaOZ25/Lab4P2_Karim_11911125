/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_karimguifarro;

/**
 *
 * @author karim
 */
public class SuperSoldado extends Soldados{
    int daño;

    public SuperSoldado(String nombre, String rango, int edad, int tiempo_ejer, int hp,int daño) {
        super(nombre, rango, edad, tiempo_ejer, hp);
        this.daño = daño;
    }
    
    @Override
    public void ataque() {
          System.out.println("el soldado" + super.getNombre() + "ha causado" + daño + "de daño con su bomba");
    }
    
}
