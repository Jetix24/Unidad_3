/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad_3;

/**
 *
 * @author 52614
 */
public class Numero {
    
    int num; 
    
    public Numero(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public String ToString(int num){
        
        return "Numero ("+num+")";
    }
}
