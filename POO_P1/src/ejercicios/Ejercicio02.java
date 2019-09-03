/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
/*
 * nombre: Gerardo Ayala Juarez
 * tema del programa: Introduccion a Java II
 * descripcion: Trabajar con variables numericas y interactuar con ellas
 * fecha: 13-08-19
 */
public class Ejercicio02 {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        int n1;
        int n2;
        int suma;
        
        System.out.print("Ingrese el 1er numero :");
        n1=reader.nextInt();
        System.out.print("Ingrese el 2do numero :");
        n2=reader.nextInt();
        suma = n1+ n2;
        System.out.println("suma de " + n1 + " y " + n2 + " es " + suma );
        System.exit(0);
    }
    
}
