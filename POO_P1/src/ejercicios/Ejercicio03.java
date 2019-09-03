package ejercicios;


import java.util.Scanner;

/*
 * nombre: Gerardo Ayala Juarez
 * tema del programa: Introduccion a Java III 
 * descripcion: Trabajar con texto y usarlos en otro mensaje.
 * fecha: 13-08-19
 */
public class Ejercicio03 {
    public static void main (String[] args){
        Scanner reader= new Scanner (System.in);
        String nombre = "";
        int edad;
        
        System.out.print("Ingrese su nombre: ");
        nombre=reader.nextLine();
        System.out.print("Ingrese su edad: ");
        edad=reader.nextInt();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
