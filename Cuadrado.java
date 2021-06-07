/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Usher
 */


public class Cuadrado {

int area;
int perimetro;
    


    public void calculaArea(int lado){
   
      
        area=lado*lado;
    }

    public int getArea() {
        return area;
    }
    
     public void calcularPerimetro(int lado){
        
        perimetro=(lado*lado)*2;
    }
     
     public int getPerimetro() {
        return perimetro;
    }
}
