/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto7.reto7;

import java.util.ArrayList;
import java.util.Scanner;
import reto7.reto7.Asfalto;
import reto7.reto7.Carretera;
import reto7.reto7.SinAsfaltar;
import reto7.reto7.Generico;
import reto7.reto7.model.CoordenadaModel;
/**
 *
/**
 * @author 
 * Kelly Julieth Arango Henao
 * Juan Camilo Rivera Avendaño
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
       Scanner leer = new Scanner(System.in);
       boolean salir = false;
       int opcion; 
       int x;
       int y;
       
       ArrayList<CoordenadaModel> tramos = new ArrayList<>();
       while(!salir){
            
           System.out.println("1. Con Asfalto");
           System.out.println("2. Sin Asfalto");
           System.out.println("3. Salir");
           opcion = leer.nextInt();           
           CoordenadaModel objCoordenada = new CoordenadaModel();
           if(opcion !=3){
            System.out.println("Ingrese el Punto X");
            x = leer.nextInt();                   
            System.out.println("Ingrese el Punto Y");
            y = leer.nextInt();
            objCoordenada.setX(x);
            objCoordenada.setY(y);
           }
           switch(opcion){
               case 1:
                   
                   System.out.println("Ingrese el nombre del proveedor");
                   String nombreProveedor =leer.next();         
                   System.out.println("Ingrese la velocidad maxima");
                   double velocidadMax=leer.nextDouble();
                   System.out.println("¿Es prohibido adelantar?");
                   String prohibidoAdelantar= leer.next();   
                   Asfalto asfalto = new Asfalto(nombreProveedor,velocidadMax,prohibidoAdelantar);
                   objCoordenada.setLongitud(asfalto.Longitud(objCoordenada));
                   objCoordenada.setArea(asfalto.Area(objCoordenada));
                   objCoordenada.setVolumen(asfalto.Volumen(objCoordenada));           
                   objCoordenada.setTipo("Asfalto");
                   tramos.add(objCoordenada);
                   break;
               case 2:
                                               
                   System.out.println("Ingrese el tipo de material");
                   String tipoMaterial=leer.next();
                   System.out.println("Ingrese el espesor");
                   double espesorMaterial=leer.nextInt();
                   SinAsfaltar sinAsfalto = new SinAsfaltar(tipoMaterial,espesorMaterial);
                   objCoordenada.setLongitud(sinAsfalto.Longitud(objCoordenada));
                   objCoordenada.setArea(sinAsfalto.Area(objCoordenada));
                   objCoordenada.setVolumen(sinAsfalto.Volumen(objCoordenada));
                   objCoordenada.setVolumenMaterial(sinAsfalto.VolumenMaterial(objCoordenada));
                   
                   //objCoordenada.setVolumen(anchoSinAsfalto);
                   objCoordenada.setTipo("Sin Asfalto");
                   tramos.add(objCoordenada);
                   break;
                case 3:
                   Carretera carretera = new Carretera(tramos);
                   System.out.println("La longitud total de la carretera es: "+carretera.Longitud()+" metros");
                   System.out.println("El area total de la carretera es: "+ carretera.Area()+" metros cuadrados");
                   System.out.println("El volumen total de la carretera es: " + carretera.VolumenTotal()+" metros cubicos");         
                   System.out.println("El volumen total con asfalto es: " + carretera.VolumenPorTipo("Asfalto")+" metros cubicos");
                   System.out.println("El volumen total sin asfalto es: "+ carretera.VolumenPorTipo("Sin Asfalto")+" metros cubicos");
                   System.out.println("El volumen del material es: "+ carretera.VolumenMaterial()+" metros cubicos");
                   System.out.println("El tramo está conectado: "+ carretera.Conectar());
                   salir=true;
                   
                   
                   break;
                default:
                   System.out.println("Solo números entre 1 y 3");
           }
            
       }
        
    
    }
    
}

