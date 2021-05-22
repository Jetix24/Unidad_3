/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad_3.Figuras;

import static java.lang.Math.PI;

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
        return (radio*radio*PI);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
