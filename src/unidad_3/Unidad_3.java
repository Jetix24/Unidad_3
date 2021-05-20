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
public class Unidad_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona vecina = new Persona ("Luisa", "Asenjo Martínez", 1978);
        Alumno unAlumno = new Alumno ("Juan", "Ugarte López", 1985);

        vecina.imprime();
        unAlumno.ponGrupo("66", 'M'); 
        unAlumno.imprime();
        unAlumno.imprimeGrupo();

    }
}
    

