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
public abstract class Soldados {
    private String nombre,rango;
    private int edad,tiempo_ejer,hp;

    public Soldados() {
    }

    public Soldados(String nombre, String rango, int edad, int tiempo_ejer, int hp) {
        this.nombre = nombre;
        this.rango = rango;
        this.edad = edad;
        this.tiempo_ejer = tiempo_ejer;
        this.hp = hp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTiempo_ejer() {
        return tiempo_ejer;
    }

    public void setTiempo_ejer(int tiempo_ejer) {
        this.tiempo_ejer = tiempo_ejer;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", rango=" + rango + ", edad=" + edad + ", tiempo_ejer=" + tiempo_ejer + ", hp=" + hp + '}';
    }
    public abstract void ataque();
}
