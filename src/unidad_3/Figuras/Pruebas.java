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
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo Rec = new Rectangulo(2.0,4.0);

        //Rectangulos
        System.out.println("Recatangulos");
        System.out.println("Perimetros");
        //Perimetro (1er.objeto)
        System.out.println("Rectangulo base " + Rec.getBase() + " altura " + Rec.getAltura() + " es " + Rec.cal_Perimetro());
        System.out.println("Area");
        //Area (1er.objeto)
        System.out.println("Rectangulo base " + Rec.getBase() + " altura " + Rec.getAltura() + " es " + Rec.cal_Area());
   
        System.out.println("");
        Circulo Cir = new Circulo(2.0);
        
        // Circulos
        System.out.println("Circulos");
        System.out.println("Perimetros");
        //Perimetro (1er.objeto)
        System.out.println("Circulo radio: " + Cir.getRadio() + ": " + Cir.cal_Perimetro());
        System.out.println("Area");
        //Area (1er.objeto)
        System.out.println("Circulo radio: " + Cir.getRadio() + ": " + Cir.cal_Area());
    
    }
    
}
