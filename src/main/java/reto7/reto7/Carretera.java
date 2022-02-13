/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto7.reto7;

import java.util.ArrayList;
import reto7.reto7.model.CoordenadaModel;
/**
 *
/**
 * @author 
 * Kelly Julieth Arango Henao
 * Juan Camilo Rivera Avendaño
 */
public class Carretera {

    private ArrayList<CoordenadaModel> tramos;

    public Carretera(ArrayList<CoordenadaModel> tramos) {
        this.tramos = tramos;
    }

    public double Longitud() {
        double valorLongitud = 0;
        for (int i = 0; i < tramos.size(); i = i + 1) {
            valorLongitud = valorLongitud + tramos.get(i).getLongitud();
        }
        return valorLongitud;
    }

    public double Area() {
        double valorArea = 0;
        for (int i = 0; i < tramos.size(); i = i + 1) {
            valorArea = valorArea + tramos.get(i).getArea();
        }
        return valorArea;
    }

    public double VolumenPorTipo(String tipo) {
        double valorVolumen = 0;
        for (int i = 0; i < tramos.size(); i = i + 1) {
            if (tipo.equals(tramos.get(i).getTipo())) {
                valorVolumen = valorVolumen + tramos.get(i).getVolumen();
            }
        }
        return valorVolumen;
    }

    public double VolumenMaterial() {
        double valorVolumenMaterial = 0;
        for (int i = 0; i < tramos.size(); i = i + 1) {
            valorVolumenMaterial = valorVolumenMaterial + tramos.get(i).getVolumenMaterial();
        }
        return valorVolumenMaterial;
    }

    public double VolumenTotal() {
        double valorTotal = 0;
        for (int i = 0; i < tramos.size(); i = i + 1) {
            valorTotal = valorTotal + tramos.get(i).getVolumen();
        }
        return valorTotal;
    }

    public boolean Conectar() {
        boolean conectado = false;
        for (int i = 0; i < tramos.size(); i = i + 1) {
            for (int z = 0; z < i; z++) {
                if (tramos.get(i) == tramos.get(z)) {
                    
                 conectado=true;
                                   
                }
                
            }
            return conectado;

        }
        return conectado;
    }

}
