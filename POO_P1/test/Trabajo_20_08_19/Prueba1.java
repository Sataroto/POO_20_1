/*
 * nombre: Gerardo Ayala Juarez
 * tema del programa:
 * descripcion:
 * fecha: @date
 */
package Trabajo_20_08_19;

import ejercicios.Persona;

/**
 *
 * @author Gerardo Ayala Juarez
 */
public class Prueba1 {
    void main (String[] gggg){
        Persona Gerardo = new Persona(21, 70);
        
        System.out.println("Su IMC: "+Gerardo.CalcularImc());
        System.out.println("Su Situacion es: "+Gerardo.SituacionImc());
        
    }
    
}
