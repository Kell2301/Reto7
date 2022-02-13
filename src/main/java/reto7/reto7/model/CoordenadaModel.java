/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto7.reto7.model;

/**
 *
/**
 * @author 
 * Kelly Julieth Arango Henao
 * Juan Camilo Rivera Avendaño
 */
public class CoordenadaModel {
    
    private double x;
    private double y;
    private double longitud;
    private double area;
    private double volumen;
    private String tipo;
    private double volumenMaterial;

    public void setVolumenMaterial(double volumenMaterial) {
        this.volumenMaterial = volumenMaterial;
    }

    public double getVolumenMaterial() {
        return volumenMaterial;
    }
    

    public double getX() {
        return x;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getLongitud() {
        return longitud;
    }

    public double getArea() {
        return area;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    
    
    
}
