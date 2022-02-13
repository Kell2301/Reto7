/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto7.reto7;

import reto7.reto7.model.CoordenadaModel;

//**
/**
 * @author 
 * Kelly Julieth Arango Henao
 * Juan Camilo Rivera Avendaño
 */
public class Asfalto extends Generico {

    private double ancho = 8;
    private double espesor = 0.25;
    private String nombreProveedor;
    private double velocidadMax;
    private String prohibidoAdelantar;
    public Asfalto(String nombreProveedor, double velocidadMax, String prohibidoAdelantar){
        
        this.nombreProveedor = nombreProveedor;
        this.velocidadMax = velocidadMax;
        this.prohibidoAdelantar = prohibidoAdelantar;
     }


    @Override
    public double Longitud(CoordenadaModel obj) {
        double elevarCoordenadaX= Math.pow((obj.getX()-0),2);
        double elevarCoordenadaY= Math.pow((obj.getY()-0),2);
        double longitud = Math.sqrt(elevarCoordenadaX + elevarCoordenadaY);
       //  double longitud=obj.getX()+obj.getY();
        return longitud;
    }

    @Override
    public double Area(CoordenadaModel longitud) {
        double area= longitud.getLongitud()*ancho;
        return area;
    }

    @Override
    public double Volumen(CoordenadaModel longitud ) {
        double volumen = longitud.getLongitud()*ancho*espesor;   
        return volumen;
    }
    
    public double VolumenAsfaltado(CoordenadaModel longitud ) {
        double volumenAsfaltado = longitud.getLongitud()*ancho*espesor;   
        return volumenAsfaltado;
    }
   
}
