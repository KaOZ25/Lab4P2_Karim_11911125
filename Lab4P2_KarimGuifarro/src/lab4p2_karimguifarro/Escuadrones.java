/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_karimguifarro;

import java.util.ArrayList;

/**
 *
 * @author karim
 */
public class Escuadrones {
    private String nombre;
    ArrayList <Zonas> conquista=new ArrayList();
    ArrayList <Soldados> escuadron=new ArrayList();

    public Escuadrones() {
    }

    public Escuadrones(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", conquista=" + conquista + ", escuadron=" + escuadron + '}';
    }
    
}
