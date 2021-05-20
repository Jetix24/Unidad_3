/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad_3.Figuras;

/**
 *
 * @author 52614
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double cal_Perimetro(){
        return (2*radio*3.1416);
    }
    public double cal_Area(){
        return (radio*radio*3.1416);
    }
    
}
