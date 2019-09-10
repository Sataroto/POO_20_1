/*
 *Nombre:Gerardo Ayala Juarez
 *Tema:Sobrecarga
 *Descripcion: Es donde se prueba el funcionamiento del ejercicio 1
 *Fecha: 05-sep-2019
 *
 */
package Prueba;

import ejercicio2.Conjunto;

public class PruebaEjercicio2 {
public static void main (String[] agggg){
    int[] ar=new int[] {5,4,3,2,1,2,8};
    char[] hola= new char[] {'j','a','l','i','s','c','o'};
    Conjunto cadena = new Conjunto("CaCaHuates");
    Conjunto arreglo = new Conjunto(ar);
    Conjunto caracteres = new Conjunto(hola);
    System.out.println("cadena");
    cadena.SacarRango(2);
    cadena.SacarRango(2,6);
    cadena.SacarRango(1,6,2);
    System.out.println("arreglo");
    arreglo.SacarRango(2);
    arreglo.SacarRango(2,6);
    arreglo.SacarRango(2,6,2);
    System.out.println("caracteres");
    caracteres.SacarRango(2);
    caracteres.SacarRango(2,6);
    caracteres.SacarRango(1, 6, 2);
    }    
}
