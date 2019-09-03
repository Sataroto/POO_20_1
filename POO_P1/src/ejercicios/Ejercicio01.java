/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/*
 * nombre: Gerardo Ayala Juarez
 * tema del programa: Introduccion a Java I
 * descripcion: Variante de Hola Mundo
 * fecha: 13-08-19
 */
public class Ejercicio01 {
    public static void main(String[] args){
       Persona Gerardo = new Persona(70, 1.70f);
        
        System.out.println("Su IMC: "+Gerardo.CalcularImc());
        System.out.println("Su Situacion es: "+Gerardo.SituacionImc());
       
    }
}
