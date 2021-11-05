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
public class Zonas {
    private String nombre;
    private int tamaño,X,Y;

    public Zonas() {
    }

    public Zonas(String nombre, int tamaño, int X, int Y) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.X = X;
        this.Y = Y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", tama\u00f1o=" + tamaño + ", X=" + X + ", Y=" + Y + '}';
    }
    
}
