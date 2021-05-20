/*

*/
package unidad_3.Figuras;

/**
 *
 * @author 52614
 */
public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double cal_Perimetro(){
        return (base*2+altura*2);
    }
    public double cal_Area(){
        return (base*altura);
    }
}
