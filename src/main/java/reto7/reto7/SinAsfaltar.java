/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto7.reto7;

import reto7.reto7.model.CoordenadaModel;

/**
 *
/**
 * @author 
 * Kelly Julieth Arango Henao
 * Juan Camilo Rivera Avendaño
 */
public class SinAsfaltar extends Generico {
    
    private double ancho = 6;
    private double espesor=0.25;
    private String tipoMaterial;
    private double espesorMaterial;
            
    public SinAsfaltar(String tipoMaterial, double espesorMaterial){
        
        this.tipoMaterial = tipoMaterial;
        this.espesorMaterial = espesorMaterial;
               
    }
    @Override
    public double Longitud(CoordenadaModel obj){
        double elevarCoordenadaX= Math.pow((obj.getX()-0),2);
        double elevarCoordenadaY= Math.pow((obj.getY()-0),2);
        double longitud = Math.sqrt(elevarCoordenadaX + elevarCoordenadaY);
        return longitud;
    }
     
    @Override
    public double Area(CoordenadaModel longitud){
        double area= longitud.getLongitud()*ancho;
        return area;
        
    }
     
    @Override
    public double Volumen(CoordenadaModel longitud){
        double volumen = longitud.getLongitud()*ancho*espesor;   
        return volumen;
    }
    
    public double VolumenMaterial(CoordenadaModel longitud){
        double volumenMaterial = longitud.getLongitud()*ancho*espesorMaterial;   
        return volumenMaterial;
    }

  
  
}
